package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Draghu
 * @date 2018/11/7 11:18
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka2App {

    public static void main(String[] args) {
        SpringApplication.run(Eureka2App.class, args);
    }
}
