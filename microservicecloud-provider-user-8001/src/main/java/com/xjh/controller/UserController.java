package com.xjh.controller;

import com.xjh.entity.User;
import com.xjh.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping(value="/user/add",method = RequestMethod.POST)
    public int add(@RequestBody User user){
        int add = userService.add(user);
        return add;
    }
    @RequestMapping(value="/user/get/{id}",method = RequestMethod.GET)
    public User get(@PathVariable("id") String id){
        User user = userService.get(id);
        return user;
    }
    @RequestMapping(value = "/user/getList")
    public List<User> getList(){
        return userService.getList();
    }
}
