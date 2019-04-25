package com.pander.user.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
/**
 * 验证用户名+密码是否跟数据库中是否一致
 */
public class CodecUtils {

    public static String passwordBcryptEncode(String username,String password){

        return new BCryptPasswordEncoder().encode(username + password);
    }

    public static Boolean passwordConfirm(String rawPassword,String encodePassword){
        return new BCryptPasswordEncoder().matches(rawPassword,encodePassword);
    }
}
