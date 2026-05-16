package com.example.controller;


import com.example.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.User;
import com.example.service.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServices service;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {

        return service.saveUser(user);
    }
}