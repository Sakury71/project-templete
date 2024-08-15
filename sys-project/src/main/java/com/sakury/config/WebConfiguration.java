package com.sakury.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Author: Sakury
 * Date: 2024/8/15 14:40
 * Version: 1.0
 * Description:
 */
@Configuration
public class WebConfiguration {
    @Bean
    public BCryptPasswordEncoder PasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
