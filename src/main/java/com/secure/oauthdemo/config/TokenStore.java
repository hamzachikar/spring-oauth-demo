package com.secure.oauthdemo.config;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class TokenStore {

    private final Map< String, Authentication> cache = new HashMap<>();

    public User generateToken( Authentication authentication ) {
        String token = UUID.randomUUID().toString();
        cache.put( token, authentication );
        return new User(authentication,token);
    }

    public Authentication getAuth( String token ) {
        return cache.getOrDefault( token, null );
    }
}
