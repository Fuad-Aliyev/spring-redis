package com.spring.redis.dto;

public class UserRequestDto {
    private String emailId;
    private String password;

    public UserRequestDto(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public UserRequestDto(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserRequestDto{" +
                "emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
