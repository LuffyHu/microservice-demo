package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Draghu
 * @date 2018/11/6 18:23
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider2App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider2App.class, args);
    }
}
