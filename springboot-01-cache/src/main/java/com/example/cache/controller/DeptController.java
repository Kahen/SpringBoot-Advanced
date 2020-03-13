package com.example.cache.controller;

import com.example.cache.bean.Department;
import com.example.cache.service.DeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-03-13 11:33
 */
@RestController
public class DeptController {
    @Resource
    DeptService deptService;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id) {
        Department deptById = deptService.getDeptById(id);
        return deptById;
    }
}
