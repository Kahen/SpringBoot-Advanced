package com.example.springboot03elasticsearch.elastic.repository;

import com.example.springboot03elasticsearch.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-03-18 20:27
 */
public interface BookRepository extends ElasticsearchRepository<Book, Integer> {
    /**
     * 参照Spring官方文档 https://docs.spring.io/spring-data/elasticsearch/docs/3.2.5.RELEASE/reference/html/
     * 寻找书本列表
     *
     * @param bookName
     * @return
     */
    public List<Book> findBooksByBookName(String bookName);
}
