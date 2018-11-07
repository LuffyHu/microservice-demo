package com.atguigu.springcloud.config;

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
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
