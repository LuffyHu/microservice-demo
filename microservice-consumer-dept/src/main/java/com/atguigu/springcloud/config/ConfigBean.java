package com.atguigu.springcloud.config;

import com.atguigu.myrule.SelfRandomRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Draghu
 * @date 2018/11/7 9:37
 */

@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        return new SelfRandomRule();    // 达到目的，使用重新选择的随机算法代替默认的轮询
    }
}
