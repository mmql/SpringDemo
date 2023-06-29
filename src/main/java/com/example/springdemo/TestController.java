package com.example.springdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @author:wujuan
 * @date 2023/6/21 21:16
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "asd";
    }
}
