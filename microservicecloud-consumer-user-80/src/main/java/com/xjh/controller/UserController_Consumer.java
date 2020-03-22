package com.xjh.controller;

import com.xjh.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController_Consumer {
    private  static final String REST_URL_PREFIX = "http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping(value = "/consumer/user/get/{id}",method = RequestMethod.GET)
    public User get(@PathVariable("id") String id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/user/get/"+id,User.class);
    }
    @RequestMapping(value = "/consumer/user/getList",method = RequestMethod.GET)
    public List<User> getList(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/user/getList",List.class);
    }
    @RequestMapping(value = "/consumer/user/add")
    public int add(@RequestBody User user){
        System.out.println(user);
        return restTemplate.postForObject(REST_URL_PREFIX+"/user/add",user,int.class);
    }
}
