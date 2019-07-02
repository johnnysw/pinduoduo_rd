package com.weichuang.pinduoduo_rd.dao;

import com.weichuang.pinduoduo_rd.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * User实体映射器接口
 * @author cc
 * @date 2019-06-12
 *
 * @Mapper注解是Mybatis框架用的，标记为映射器
 * @Repository注解是Spring框架用的，标记为一个Bean
 */
@Mapper
@Repository
public interface UserMapper {

    public User login(@Param("username") String username,
                      @Param("password") String password);

    User findUserById(String userId);

}