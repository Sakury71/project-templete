package com.sakury.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Sakury
 * Date: 2024/8/14 21:15
 * Version: 1.0
 * Description:
 */
@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
