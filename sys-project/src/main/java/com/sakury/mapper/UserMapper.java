package com.sakury.mapper;

import com.sakury.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author: Sakury
 * Date: 2024/8/15 12:16
 * Version: 1.0
 * Description:
 */
@Mapper
public interface UserMapper {
    User selectAllById(Long uid);

    User selectUserByUsernameOrEmail(String text);
}
