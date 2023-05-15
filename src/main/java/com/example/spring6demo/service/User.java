package com.example.spring6demo.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author leelixiangjun
 * @date 2023/5/15 23:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private Integer id;

    private String name;
}
