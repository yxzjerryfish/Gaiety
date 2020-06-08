package com.fish.gaiety.gateway.service;

import com.fish.gaiety.gateway.entity.user.UserLoginInfo;

/**
 * 用户服务
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2020/6/8 12:53
 */
public interface UserService {
    /**
     *  查询用户数量
     * @return 用户数量
     */
    Integer findUserCount();

    /**
     * 新增用户信息
     * @param userLoginInfo 用户登录信息
     */
    void addUser(UserLoginInfo userLoginInfo);
}
