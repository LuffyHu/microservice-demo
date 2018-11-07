package com.atguigu.springcloud.web;

import com.atguigu.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Draghu
 * @date 2018/11/7 9:45
 */

@RestController
public class DeptConsumerController {

    private static final String REST_URL_PREFIX = "http://MICROSERVICE-PROVIDER-DEPT";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }


    @RequestMapping(value = "/consumer/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list/" , List.class);
    }

    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }
}
