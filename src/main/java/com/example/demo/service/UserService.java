package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.domain.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public User register(String name) {
        return userRepository.register(name);
    }

}
