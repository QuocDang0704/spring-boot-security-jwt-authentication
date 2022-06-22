package com.dangquoc.springbootsecurityjwtauthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test2Controller {
    @GetMapping("/getAll")
    public String test1(){
        return "HelloWorld";
    }
}
