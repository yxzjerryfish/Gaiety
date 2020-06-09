package com.fish.gaiety.gateway.constant;

import lombok.Getter;

/**
 * 初始化数据静态常量
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2020/6/9 9:11
 */
public enum  BootConstant {
    /**
     *  默认用户
     */
    ADMIN_USER_NAME("admin"),
    /**
     * 默认密码
     */
    ADMIN_USER_PASSWD("123456")
    ;

    @Getter
    private String data;

    BootConstant(String data) {
        this.data = data;
    }
}
