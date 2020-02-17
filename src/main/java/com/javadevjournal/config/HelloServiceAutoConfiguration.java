package com.javadevjournal.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javadevjournal.service.HelloService;
import com.javadevjournal.service.HelloServiceImpl;

@Configuration
@ConditionalOnClass(HelloService.class)
public class HelloServiceAutoConfiguration {


    //conditional bean creation
    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService(){

        return new HelloServiceImpl();
    }
}