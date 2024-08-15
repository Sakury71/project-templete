package com.sakury.pojo.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Author: Sakury
 * Date: 2024/8/14 20:28
 * Version: 1.0
 * Description: 授权对象模型
 */
@Data
public class AuthorizeDTO implements Serializable {
    private String username;
    private String role;
    private String token;
    private Date expireTime;
}
