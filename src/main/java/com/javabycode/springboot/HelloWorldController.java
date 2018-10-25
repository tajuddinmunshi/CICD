package com.javabycode.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="Taj") String name) {
        
        String message="You are a Role Model!!";
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        
        return "hello";
    }
}
