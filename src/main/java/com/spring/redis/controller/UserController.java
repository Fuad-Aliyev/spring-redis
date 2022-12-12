package com.spring.redis.controller;

import com.spring.redis.dto.AuthUserDto;
import com.spring.redis.dto.UserResponseDto;
import com.spring.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/auth")
    public UserResponseDto authenticateUser(@RequestBody AuthUserDto request) {
        return userService.authUser(request);
    }
}
