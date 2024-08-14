package com.sakury.entity.dto;

import lombok.Data;

import java.util.Date;

/**
 * Author: Sakury
 * Date: 2024/8/14 20:28
 * Version: 1.0
 * Description: 授权对象模型
 */
@Data
public class AuthorizeDTO {
    private String username;
    private String role;
    private String token;
    private Date expireTime;
}
