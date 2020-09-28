package com.itheima.health.dao;

import com.itheima.health.entity.Result;
import com.itheima.health.pojo.CheckItem;

import java.util.List;

/**
 * @Author:lihongda
 * @Date: 2020/9/24 16:20
 */
public interface CheckItemDao {
   List<CheckItem> findAll();

   void add(CheckItem checkItem);
}
