package com.example.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 搭建基本环境
 * 1、导入数据库文件，创建出department和employee表
 * 2、创建javaBean封装数据
 * 3、整合mybatis操作数据库
 * 1.配置数据源信息
 * 2.使用注解版的mybatis；
 * 1）@MapperScan指定需要扫描的mapper接口所在的包
 * 二、快速体验缓存
 * 步骤：
 * 1、开启基于注解的缓存
 * 2、标注缓存注解即可
 * 三、整个redis作为缓存
 * 1.安装redis，使用docker
 * 2.引入redis的starter
 * 3.配置redis
 * 4.测试缓存
 *      原理：CacheManager===Cache 缓存逐渐实际给缓存中存取数据
 *      1）、引入redis的starter，容器中保存的是redisCacheManager
 *      2）、redisCacheManager帮我们创建redisCache来作为缓存组件，redisCache通过redis缓存数据
 *      3）默认保存数据，k-v都是object，利用序列化保存，如何保存为 json
 *          1.引入redis的starter，cacheManager变为RedisCacheManager
 *          2.默认创建的RedisManager操作redis的时候使用RedisTemplate<Object, Object>
 *          3.RedisTemplate<Object, Object>是默认使用jdk的序列化机制
 *      4）、自定义CacheManager
 *
 */
@MapperScan("com.example.cache.mapper")
@SpringBootApplication
@EnableCaching
public class Springboot01CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01CacheApplication.class, args);
    }

}
