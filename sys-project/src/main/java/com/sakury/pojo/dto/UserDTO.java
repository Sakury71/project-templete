package com.sakury.pojo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Author: Sakury
 * Date: 2024/8/15 8:02
 * Version: 1.0
 * Description:
 */
@Data
public class UserDTO implements Serializable {
    private Long uid;
    private String username;
    private String password;
    private String email;
}
