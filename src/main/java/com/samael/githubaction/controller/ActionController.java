package com.samael.githubaction.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {

    @GetMapping("/")
    public String home(){
        return "Hello, Samael";
    }
    @GetMapping("/welcome")
    public String welcome(){

        return  "Welcome, Samael! \uD83C\uDF1F\n" +
                "\n" +
                "We’re thrilled to have you on board, ready to bring your incredible expertise and energy into this space. Here’s to exploring new heights and conquering every challenge with power and grace. May your journey here be filled with innovation, growth, and triumph! \n" +
                "\n" +
                "Let’s make great things happen!";
    }
}
