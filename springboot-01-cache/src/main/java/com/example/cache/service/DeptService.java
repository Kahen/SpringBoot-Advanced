package com.example.cache.service;

import com.example.cache.bean.Department;
import com.example.cache.mapper.DepartmentMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author Kahen
 */
@Service
public class DeptService {
    @Resource
    DepartmentMapper departmentMapper;


    @Cacheable(cacheNames = "dept")
    public Department getDeptById(Integer id) {
        Department department = departmentMapper.getDeptById(id);

        return department;
    }
}
