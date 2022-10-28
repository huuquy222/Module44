package com.example.taoungdungtinhtoan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CalculatorController {

    @RequestMapping("/c")
    public String loadIndex(){
        return "index";
    }
    @GetMapping(path = "/submit")
    public String submit(
            @RequestParam(required = false, name = "calculator") String[] calculator ,
            ModelMap modelMap
    ){
        if (calculator == null){
            modelMap.addAttribute("message","bạn hãy nhập phép tính của mình");
            return "index";
        } else {
            modelMap.addAttribute("calculator",calculator);
            return "submit";
        }
    }


}
