package com.example.mavendemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello " + System.currentTimeMillis();
    }
}
