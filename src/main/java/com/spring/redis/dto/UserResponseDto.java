package com.spring.redis.dto;

public class UserResponseDto {
    private String message;
    private Object data;

    public UserResponseDto(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public UserResponseDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
