package com.sakury.service.impl;

import com.sakury.mapper.UserMapper;
import com.sakury.pojo.entity.User;
import com.sakury.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Author: Sakury
 * Date: 2024/8/15 13:11
 * Version: 1.0
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectAllById(Long uid) {
        return userMapper.selectAllById(uid);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.selectUserByUsernameOrEmail(username);
        if (user == null)
            throw new UsernameNotFoundException("用户不存在");
        return org.springframework.security.core.userdetails.User
                .withUsername(username)
                .password(user.getPassword())
                .roles(user.getRole())
                .build();
    }

    public User selectUserByUsernameOrEmail(String text){
        return userMapper.selectUserByUsernameOrEmail(text);
    }
}
