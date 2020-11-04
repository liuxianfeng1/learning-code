package com.liu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Package: com.liu.config
 * @ClassName: MyMvcConfig
 * @Author: 刘先锋
 * @CreateTime: 2020/11/2 21:39
 * @Description:
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        
    }
}
