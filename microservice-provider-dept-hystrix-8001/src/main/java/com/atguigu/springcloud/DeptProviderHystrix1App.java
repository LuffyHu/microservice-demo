package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Draghu
 * @date 2018/11/6 18:23
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  // 服务发现
@EnableCircuitBreaker   // 对hystrix熔断机制的支持
public class DeptProviderHystrix1App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix1App.class, args);
    }
}
