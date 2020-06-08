package com.fish.gaiety.registry.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Eureka 禁止掉防csrf攻击
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2020/6/8 12:35
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 禁止掉防csrf攻击
     * @param http HttpSecurity
     * @throws Exception 可能的异常
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http);
    }
}
