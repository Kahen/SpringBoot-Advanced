package com.example.springboot03elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Kahen
 * Springboot默认支持两种技术来和ES交互
 * 1.jest（默认不生效）
 * 需要导入jest的工具包（io.searchbox.client.JestClient)
 * 2.SpringbootData ElasticSearch
 * 1)、Client 节点信息clusterNodes：clusterName
 * 2） 、ElasticsearchTemplate 操作es
 * 3）、编写一个ElastcsearchRepository的子接口来操作ES;
 */
@SpringBootApplication
public class Springboot03ElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03ElasticsearchApplication.class, args);
    }

}
