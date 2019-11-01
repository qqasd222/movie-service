package com.alibaba.demo.microsvc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

//    @Value("${test.value}")
//    String test;

    public void run(ApplicationArguments args) {
//        System.out.println(test);
    }
}