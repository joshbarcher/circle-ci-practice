package com.example.circlecipractice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApi
{
    @GetMapping
    public String home()
    {
        return "Hello, world!";
    }
}
