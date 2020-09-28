package com.itheima;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author:lihongda
 * @Date: 2020/9/24 14:17
 */
public class ServiceApplication {
    public static void main(String[] args) throws IOException {
        new ClassPathXmlApplicationContext("classpath:applicationContext-service.xml");
        System.in.read();
    }
}
