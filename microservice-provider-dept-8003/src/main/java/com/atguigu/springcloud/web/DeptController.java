package com.atguigu.springcloud.web;

import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Draghu
 * @date 2018/11/6 18:11
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @Resource
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("***************" + list);

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for(ServiceInstance element: srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t"
            + element.getPort() + "\t" + element.getUri());
        }
        return this.client;
    }

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add (Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }


}
