package com.weichuang.pinduoduo.service.impl;

import com.weichuang.pinduoduo.dao.UserMapper;
import com.weichuang.pinduoduo.entity.User;
import com.weichuang.pinduoduo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务实现类
 * @author liudun
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User login(String uName, String pwd) {
        return userMapper.login(uName,pwd);
    }

    @Override
    public User findUserById(String userId) {
        return userMapper.findUserById(userId);
    }



}
