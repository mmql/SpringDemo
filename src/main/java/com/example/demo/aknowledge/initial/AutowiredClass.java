package com.example.demo.aknowledge.initial;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class AutowiredClass {

    @PostConstruct
    public void test(){
        System.out.println("AutowiredClass 执行，Autowired 属性注入执行");
    }
}
