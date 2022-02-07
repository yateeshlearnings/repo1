package com.spring.spring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/springapp1")
public class Spring1Controller {

    @GetMapping("/home")
    String m1(){

        return "welcome to project";
    }

}
