package com.example.cache.service;

import com.example.cache.bean.Employee;
import com.example.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Kahen
 * @create 2020-03-04 9:13
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    /**
     * 将方法的运行结果进行缓存
     * <p>
     * CacheManager管理多个cache组件，对缓存的真正crud操作在Cache组件中，每一个缓存组件有自己的唯一一个名字
     * 几个属性：
     * cacheNames/value：指定缓存组件的名字,将方法的返回结果放在哪个缓存中，师叔祖的方式
     * 可以指定多个缓存；
     * key：缓存数据使用的key；可以用它来指定，默认使用方法参数的值
     * 编写SpEL;#id:参数id的值
     * keyGenerator：key的生成器：可以指定key的生成器组件id
     * 二选一使用
     * cacheManager指定使用缓存管理器：或者cacheResolver指定获取解析器 二选一
     * condition：指定符合条件才缓存
     * unless：否定缓存；当unless指定的条件为true，方法的返回值不会被缓存；可以获取结果进行判断
     * sync：是否使用异步模式
     *
     * @param id
     * @return
     */
    @Cacheable(cacheNames = "emp", keyGenerator = "myKeyGenerator")
    public Employee getEmp(Integer id) {
        System.out.println("查询" + id + "号员工");
        Employee employee = employeeMapper.getEmpById(id);
        return employee;
    }
}
