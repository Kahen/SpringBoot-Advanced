package com.example.devploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-03-24 19:39
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

}
