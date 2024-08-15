package com.sakury.controller;

import com.sakury.pojo.RestBean;
import com.sakury.pojo.entity.User;
import com.sakury.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Sakury
 * Date: 2024/8/15 13:13
 * Version: 1.0
 * Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public RestBean<User> selectAllById(@RequestParam Long uid) {
        User user = userService.selectAllById(uid);
        return RestBean.success(user);
    }
}
