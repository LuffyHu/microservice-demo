package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Draghu
 * @date 2018/11/8 9:50
 */

@Configuration
public class SelfRule {
    @Bean
    public IRule myRule(){
        return new SelfRandomRule();
    }
}
