package com.example.springdemo;

import com.example.springdemo.service.AppConfig;
import com.example.springdemo.spring.WjApplicationContext;

/**
 * @version 1.0
 * @author:wujuan
 * @date 2023/5/14 21:02
 */
public class Test {

    public static void main(String[] args) {


        WjApplicationContext wjApplicationContext = new WjApplicationContext(AppConfig.class);
    }
}
