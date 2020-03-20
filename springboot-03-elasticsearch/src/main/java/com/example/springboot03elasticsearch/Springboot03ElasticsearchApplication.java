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
 * 关于es不能启动，或者启动之后关闭，可以使用下面方法
 * 下载：docker pull elasticsearch:6.4.3
 * 启动：docker run -d --name es -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch:6.4.3
 * 进入容器修改配置：docker exec -it es /bin/bash
 * 进入配置文件夹：cd config
 * 修改配置文件：vi elasticsearch.yml
 * 添加配置：
 * http.cors.enabled: true
 * http.cors.allow-origin: "*"
 */
@SpringBootApplication
public class Springboot03ElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03ElasticsearchApplication.class, args);
    }

}
