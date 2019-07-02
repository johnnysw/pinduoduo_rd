package com.weichuang.pinduoduo_rd.service;


import com.weichuang.pinduoduo_rd.entity.User;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    public User login(String uName, String pwd);

    User findUserById(String userId);
}
