package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class train {
    @GetMapping("/mytrain")
    public String getData(){
        return  "Please book you train tickets from makemytrip";
    }
}
