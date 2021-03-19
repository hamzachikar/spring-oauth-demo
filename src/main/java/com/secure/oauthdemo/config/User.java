package com.secure.oauthdemo.config;

import org.springframework.security.core.Authentication;

public class User {
    private Authentication authentication;
    private String token;

    public User(Authentication authentication,String token) {
        this.authentication=authentication;
        this.token=token;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
