package com.spring.redis.dto;

public class AuthUserDto extends UserRequestDto{

    public AuthUserDto(String emailId, String password) {
        super(emailId, password);
    }


}
