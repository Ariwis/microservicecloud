package com.xjh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2017/12/2.
 */

@SpringBootApplication
@MapperScan("com.xjh.dao")
public class UserProvider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(UserProvider8001_App.class, args);
    }
}
