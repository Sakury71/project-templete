package com.sakury.pojo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Author: Sakury
 * Date: 2024/8/15 8:09
 * Version: 1.0
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Long uid;
    private String nickname;
    private String username;
    private String password;
    private String email;
    private String role;
    private Integer age;
    private String sex;
    private Integer status;
    private String phone;
    //头像
    private String avatar;
    //注册时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;
}
