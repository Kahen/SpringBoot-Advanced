package com.example.task.controller;

import com.example.task.service.AsyncService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-03-19 9:15
 */
@RestController
public class AsyncController {
    @Resource
    AsyncService asyncService;

    @GetMapping("/hello")
    public String hello() {
        asyncService.hello();
        return "success";
    }
}
