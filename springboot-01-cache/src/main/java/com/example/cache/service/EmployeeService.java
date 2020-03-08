package com.example.cache.service;

import com.example.cache.bean.Employee;
import com.example.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Kahen
 * @create 2020-03-04 9:13
 */
@CacheConfig(cacheNames = "emp")
@Service
public class EmployeeService {
    @Resource
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
    @Cacheable
    public Employee getEmp(Integer id) {
        System.out.println("查询" + id + "号员工");
        Employee employee = employeeMapper.getEmpById(id);
        return employee;
    }

    /**
     * @CachePut: 既调用方法，又更新缓存数据；
     * 修改了数据库的某个数据，同时更新缓存
     * 运行时机：
     * 1.先调用目标方法
     * 2.将目标方法结果缓存起来
     * <p>
     * 测试步骤：
     * 1.查询1号员工；查询的结果会放在缓存中
     * 2.以后查询还是之前的结果
     * 3.更新1号员工；【lastName：zhangsan，gender=1；】
     * 将方法的返回值也放进缓存了；key：传入的employee对象，返回的employee对象；
     * 4。查询1号员工？
     * 应该是更新后的员工，
     * key="#employee.id"使用传入的参数的员工id
     * key="result.id":使用的返回的id
     * @Cacheable 的key是不能用@result
     * <p>
     * 为什么是更新前的？【1号员工没有在缓存中更新】
     */
    @CachePut(value = "emp", key = "#result.id")
    public Employee updateEmp(Employee employee) {
        System.out.println("updateEmp:" + employee);
        employeeMapper.updateEmp(employee);
        return employee;
    }

    /**
     * @CacheEvict: 缓存清除
     * key：指定要清除的数据
     * allEntries:指定清除这个缓存中所有的数据
     * beforeInvocation=false：缓存的清除是否在方法之前执行，
     * 默认代表是在方法执行之后执行
     */
    @CacheEvict(/*value = "emp",*/ key = "#id", allEntries = true)
    public void deleteEmp(Integer id) {
        System.out.println("deleteEmp" + id);
        // employeeMapper.deleteEmpById(id);
    }

    /**
     * @Caching 定义复杂的缓存规则
     */
    @Caching(
            cacheable = {
                    @Cacheable(/*value = "emp",*/key = "#lastName")
            },
            put = {
                    @CachePut(/*value = "emp",*/key = "#result.id"),
                    @CachePut(/*value = "emp",*/key = "#result.email")

            }
    )
    public Employee getEmpByLastName(String lastName) {
        return employeeMapper.getEmpByLastName(lastName);
    }
}
