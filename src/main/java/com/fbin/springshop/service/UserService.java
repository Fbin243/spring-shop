package com.fbin.springshop.service;

import org.springframework.stereotype.Service;

import com.fbin.springshop.domain.User;

@Service
public class UserService {
    public String handleHello() {
        return "Hello from UserService";
    }

    public User createUser(User user) {
        return user;
    }
}
