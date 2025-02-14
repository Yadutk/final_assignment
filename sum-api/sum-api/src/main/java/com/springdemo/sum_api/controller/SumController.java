package com.springdemo.sum_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @GetMapping("/sum")
    public int sum(@RequestParam int num1, @RequestParam int num2) {
        return num1 + num2;
    }
}