package com.example.circlecipractice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class WebApi
{
    @GetMapping
    public String home()
    {
        return "Hello, there!";
    }
}
