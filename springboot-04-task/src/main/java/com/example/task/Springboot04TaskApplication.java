package com.example.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author Kahen
 * @EnableAsync 开启异步注解功能
 */
@EnableAsync
@SpringBootApplication
public class Springboot04TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04TaskApplication.class, args);
    }

}
