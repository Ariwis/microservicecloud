package com.xjh.service.impl;

import com.xjh.dao.UserMapper;
import com.xjh.entity.User;
import com.xjh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public int  add(User user) {
        int insert = userMapper.insert(user);
        return insert;
    }

    @Override
    public User get(String uid) {
        User user = userMapper.selectByPrimaryKey(uid);
        return user;
    }

    @Override
    public List<User> getList() {
        return userMapper.selectAll();
    }
}
