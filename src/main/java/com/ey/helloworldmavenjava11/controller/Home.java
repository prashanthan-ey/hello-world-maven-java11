package com.ey.helloworldmavenjava11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/homes")
@Controller
public class Home {

    @GetMapping
    public String welcome(){
        return "home";
    }
}
