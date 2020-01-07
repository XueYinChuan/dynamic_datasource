package com.symbol.dynamicdatasource.service;

import com.symbol.dynamicdatasource.mapper.db1.UserMapper;
import com.symbol.dynamicdatasource.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据名字查找用户
     * @return
     */
    public User selectUserByName(String name) {
        return userMapper.findUserByName(name);
    }
}
