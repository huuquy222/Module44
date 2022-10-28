package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CustomerController {
    @RequestMapping("/basic-operator-example")
    public String operatorExample(){
        return "basic-operator-example";
    }
}
