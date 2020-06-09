package com.fish.gaiety.gateway.service.impl;

import com.alibaba.fastjson.JSON;
import com.fish.gaiety.gateway.entity.user.UserLoginInfo;
import com.fish.gaiety.gateway.repository.UserRepository;
import com.fish.gaiety.gateway.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户服务实现类
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2020/6/8 12:57
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository userRepository;

    @Override
    public Integer findUserCount() {
        long userCount = userRepository.count();
        return (int) userCount;
    }

    @Override
    public void addUser(UserLoginInfo userLoginInfo) {
        UserLoginInfo savedUserLoginInfo = userRepository.save(userLoginInfo);
        log.info("Add new login User success : {}", JSON.toJSON(savedUserLoginInfo));
    }
}
