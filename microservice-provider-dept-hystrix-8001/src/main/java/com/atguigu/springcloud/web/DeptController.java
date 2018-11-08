package com.atguigu.springcloud.web;

import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = this.deptService.get(id);
        if( null == dept) {
            throw new RuntimeException("该ID: " + id + "没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id)
                .setDname("该ID：" + id + "没有对应的信息，null -- @HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }


}
