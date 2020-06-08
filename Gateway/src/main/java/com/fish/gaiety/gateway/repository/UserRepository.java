package com.fish.gaiety.gateway.repository;

import com.fish.gaiety.gateway.entity.user.UserLoginInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户Mapper
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2020/6/8 12:46
 */
public interface UserRepository extends JpaRepository<UserLoginInfo,Integer> {
}
