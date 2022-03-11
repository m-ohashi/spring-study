package com.example.demo.datasource;

import com.example.demo.domain.User;
import com.example.demo.domain.UserRepository;


public class UserRepositoryImpl implements UserRepository {
    @Override
    public User register(String name) {
        return new User(1, name);
    }
}
