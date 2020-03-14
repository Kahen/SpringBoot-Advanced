package com.example.amqp.bean;

import lombok.*;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-03-14 17:18
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    private String bookName;
    private String author;
}
