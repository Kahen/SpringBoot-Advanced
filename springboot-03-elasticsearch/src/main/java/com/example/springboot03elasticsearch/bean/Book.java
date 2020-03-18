package com.example.springboot03elasticsearch.bean;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-03-18 20:29
 */
@Data
@Document(indexName = "atguigu", type = "book")
public class Book {
    private Integer id;
    private String author;
    private String bookName;
}
