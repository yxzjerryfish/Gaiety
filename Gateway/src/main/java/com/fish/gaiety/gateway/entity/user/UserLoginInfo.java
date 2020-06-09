package com.fish.gaiety.gateway.entity.user;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 用户登录信息
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2020/6/8 12:01
 */
@Entity
@Data
public class UserLoginInfo {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false)
    private String passWord;
}
