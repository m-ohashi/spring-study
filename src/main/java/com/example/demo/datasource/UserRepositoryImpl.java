package com.example.demo.datasource;

import com.example.demo.domain.User;
import com.example.demo.domain.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User register(String name) {
        return new User(1,name);
    }
}
