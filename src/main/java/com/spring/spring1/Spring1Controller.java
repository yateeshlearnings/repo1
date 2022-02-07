package com.spring.spring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Spring1Controller {

    @GetMapping("/")
    String m1(){

        return "hello world";
    }

}
