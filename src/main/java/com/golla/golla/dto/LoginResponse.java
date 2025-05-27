package com.golla.golla.dto;

public class LoginResponse {
    private String token;

    // 생성자
    public LoginResponse(String token) {
        this.token = token;
    }

    // getter, setter
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}