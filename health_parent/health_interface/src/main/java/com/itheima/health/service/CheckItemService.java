package com.itheima.health.service;

import com.itheima.health.pojo.CheckItem;

import java.util.List;

/**
 * @Author:lihongda
 * @Date: 2020/9/24 16:14
 */
public interface CheckItemService {
    List<CheckItem> findAll();

    void add(CheckItem checkItem);
}
