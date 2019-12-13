package com.yba.ycgw.md.service.impl;

import com.yba.ycgw.md.domain.User;
import com.yba.ycgw.md.mapper.UserMapper;
import com.yba.ycgw.md.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = this.userMapper.loadUserByUsername(s);
        if(user == null){
            throw new UsernameNotFoundException("系统中不存在该用户");
        }
        return user;
    }

    @Override
    public String get(String name) {
        return null;
    }
}
