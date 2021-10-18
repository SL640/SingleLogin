package com.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class loginController {
    @GetMapping(value="/add")
    public double add(double a,double b)
    {
        var x = add(1,2);
        return a+b;
    }
}
