package com.spring.redis.service;

import com.spring.redis.dto.AuthUserDto;
import com.spring.redis.dto.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private RedisUtility redisUtility;

    public UserResponseDto authUser(AuthUserDto request) {
        AuthUserDto authUserDto1 = redisUtility.getValue(request.getEmailId());
        if (authUserDto1 == null) {
            redisUtility.setValue(request.getEmailId(), request);
            return new UserResponseDto("Getting data from db", request);
        }
        AuthUserDto authUserDto2 = redisUtility.getValue(request.getEmailId());
        return new UserResponseDto("Getting data from db", authUserDto2);
    }
}
