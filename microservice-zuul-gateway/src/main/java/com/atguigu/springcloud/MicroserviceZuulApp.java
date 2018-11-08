package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Draghu
 * @date 2018/11/7 10:03
 */
@SpringBootApplication
@EnableZuulProxy
public class MicroserviceZuulApp {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceZuulApp.class, args);
    }
}
