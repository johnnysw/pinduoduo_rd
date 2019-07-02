package com.weichuang.pinduoduo.service;


import com.weichuang.pinduoduo.entity.User;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    public User login(String uName, String pwd);

    User findUserById(String userId);
}
