package com.yba.ycgw.md.mapper;

import com.yba.ycgw.md.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    @Select("select * from SYS_USER")
    List<User> getAllUser();

    @Select("select * from SYS_USER where username=#{username}")
    User loadUserByUsername(String username);
}
