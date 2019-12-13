package com.yba.ycgw.md.service;

import com.yba.ycgw.md.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public interface UserService extends UserDetailsService {

    /**
     * 获取用户信息
     * @param name
     * @return
     */
    String get(String name);
}
