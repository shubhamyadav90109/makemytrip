package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class intercity {
    @GetMapping("/myintercity")
    public String getData(){
        return  "Please book you intercity tickets from makemytrip";
    }
}