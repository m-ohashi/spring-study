package com.example.demo.domain;

public class User {
    private final Integer userId;
    private final String userName;

    public User(Integer userid, String username) {
        this.userId = userid;
        this.userName = username;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
