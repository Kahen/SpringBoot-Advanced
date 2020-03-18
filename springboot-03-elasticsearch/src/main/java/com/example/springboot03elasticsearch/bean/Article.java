package com.example.springboot03elasticsearch.bean;

import io.searchbox.annotations.JestId;
import lombok.Data;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-03-18 17:51
 */
@Data
public class Article {
    @JestId
    private Integer id;
    private String author;
    private String title;
    private String content;
}
