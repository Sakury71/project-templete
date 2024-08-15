package com.sakury.service;

import com.sakury.pojo.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Author: Sakury
 * Date: 2024/8/15 13:11
 * Version: 1.0
 * Description:
 */
public interface UserService extends UserDetailsService {
    User selectAllById(Long uid);
    User selectUserByUsernameOrEmail(String text);
}
