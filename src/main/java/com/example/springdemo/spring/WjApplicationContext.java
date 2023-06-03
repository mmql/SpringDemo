package com.example.springdemo.spring;

import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.Annotation;

/**
 * @version 1.0
 * @author:wujuan
 * @date 2023/5/14 21:01
 */
public class WjApplicationContext {
    private Class configClass;

    public WjApplicationContext(Class configClass) {
        this.configClass = configClass;

        // 扫描
        if (configClass.isAnnotationPresent(ComponentScan.class)) {
            ComponentScan componentScanAnnotation = (ComponentScan) configClass.getAnnotation(ComponentScan.class);
            String path = String.valueOf(componentScanAnnotation.value());
        }


    }


    public Object getBean(String beanName){
        return null;
    }




}
