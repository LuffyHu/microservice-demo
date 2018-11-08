package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Draghu
 * @date 2018/11/7 10:03
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerHystrixDashboardApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerHystrixDashboardApp.class, args);
    }
}
