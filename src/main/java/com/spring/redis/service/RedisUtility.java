package com.spring.redis.service;

import com.google.gson.Gson;
import com.spring.redis.dto.AuthUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisUtility {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private Gson gson;

    public void setValue(final String key, AuthUserDto authUserDto) {
        redisTemplate.opsForValue().set(key, gson.toJson(authUserDto));
        redisTemplate.expire(key, 10, TimeUnit.MINUTES);
    }

    public AuthUserDto getValue(final String key) {
        return gson.fromJson(redisTemplate.opsForValue().get(key), AuthUserDto.class);
    }

    public void deleteKeyFromRedis(String key) {
        redisTemplate.delete(key);
    }
}
