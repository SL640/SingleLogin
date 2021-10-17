package com.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @GetMapping(value="/add")
    public double add(double a,double b)
    {
        return a+b;
    }
}
