package com.fish.gaiety.gateway.runner;

import com.fish.gaiety.gateway.constant.BootConstant;
import com.fish.gaiety.gateway.entity.user.UserLoginInfo;
import com.fish.gaiety.gateway.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * spring 开机启动
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2020/6/9 9:00
 */
@Slf4j
@Component
public class BootApplicationRunner implements ApplicationRunner {

    private UserService userService;

    @Autowired
    public BootApplicationRunner(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        int userCount = userService.findUserCount();
        if(userCount == 0){
            log.info("Start init new Login User ...");
            UserLoginInfo userLoginInfo = new UserLoginInfo();
            userLoginInfo.setUserName(BootConstant.ADMIN_USER_NAME.getData());
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encodePassword = passwordEncoder.encode(BootConstant.ADMIN_USER_PASSWD.getData());
            userLoginInfo.setPassWord(encodePassword);
            userService.addUser(userLoginInfo);
        }
    }
}
