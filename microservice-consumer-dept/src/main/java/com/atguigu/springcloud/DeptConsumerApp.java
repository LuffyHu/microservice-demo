package com.atguigu.springcloud;

import com.atguigu.myrule.SelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Draghu
 * @date 2018/11/7 10:03
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICE-PROVIDER-DEPT", configuration = SelfRule.class)
public class DeptConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApp.class, args);
    }
}
