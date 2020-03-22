package com.xjh.service;

import com.xjh.entity.User;

import java.util.List;

public interface UserService {
    public int add(User user);
    public User get(String uid);
    public List<User> getList();
}
