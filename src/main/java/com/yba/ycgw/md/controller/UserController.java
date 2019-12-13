package com.yba.ycgw.md.controller;

import com.yba.ycgw.md.domain.User;
import com.yba.ycgw.md.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户层
 */
@RestController
@RequestMapping("/rest")
public class UserController {

    @Autowired
    UserMapper userMapper;

    /**
     * 获取用户列表
     * @param name  用户名称
     */
    @GetMapping("/get")
    public String list(String name){
        System.out.println("=======123");
        List<User> list = userMapper.getAllUser();
        System.out.println(list.get(0).getUsername());
        System.out.println("=======345");
        String str = "12314";
        return str;
    }
}
