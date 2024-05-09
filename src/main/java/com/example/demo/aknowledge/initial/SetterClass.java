package com.example.demo.aknowledge.initial;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class SetterClass {
    @PostConstruct
    public void test(){
        System.out.println("SetterClass 执行，seter注入执行");
    }
}
