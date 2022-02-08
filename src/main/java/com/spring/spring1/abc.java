package com.spring.spring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class abc {
    @GetMapping("/") public String def(){return "sucessfully working";}

    @GetMapping(path = "/home")
    String home(){
        return "welcome";
    }
    @GetMapping(path = "/demo")
    String demo(){
        return "demo";
    }
}
