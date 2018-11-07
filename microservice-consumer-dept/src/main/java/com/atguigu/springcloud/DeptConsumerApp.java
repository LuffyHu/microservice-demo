package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Draghu
 * @date 2018/11/7 10:03
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApp.class, args);
    }
}
