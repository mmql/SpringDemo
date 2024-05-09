package com.example.demo.aknowledge.initial;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostConstructClass {
    @Autowired
    private AutowiredClass autowiredClass;
    private SetterClass setterClass;

    @PostConstruct
    public void test() {
        System.out.println("PostConstructClass 执行，PostConstruct注入执行");
    }

    /**
     * 属性注入只要看的是方法里的，随便命名，但一般会保持一致
     *
     * @param setterClass
     */
    @Autowired
    private void setXXX(SetterClass setterClass) {
        this.setterClass = setterClass;
    }
}
