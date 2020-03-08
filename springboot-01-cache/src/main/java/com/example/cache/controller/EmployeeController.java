package com.example.cache.controller;

import com.example.cache.bean.Employee;
import com.example.cache.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Kahen
 * @create 2020-03-04 9:16
 */
@RestController
public class EmployeeController {
    @Resource
    EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id) {
        Employee employee = employeeService.getEmp(id);
        return employee;
    }

    @GetMapping("/emp")
    public Employee updateEmployee(Employee employee) {

        Employee employee1 = employeeService.updateEmp(employee);
        return employee1;
    }

    @GetMapping("deleteemp")
    public String deleteEmployee(Integer id) {
        employeeService.deleteEmp(id);
        return "success";
    }

    @GetMapping("/emp/lastName/{lastName}")
    public Employee getEmpByLastName(@PathVariable("lastName") String lastName) {
        return employeeService.getEmpByLastName(lastName);
    }

}
