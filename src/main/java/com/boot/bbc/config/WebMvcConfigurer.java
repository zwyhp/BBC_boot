package com.boot.bbc.config;

import com.boot.bbc.user.Interceptor.AdminInterceptor;
import com.boot.bbc.user.Interceptor.LoginInterceptor;
import com.boot.bbc.user.Interceptor.MessageInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        // 映射为 user 的控制器下的所有映射
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login", "/register","/tourist/**","/info","/logout","/question","/update");
        registry.addInterceptor(new MessageInterceptor()).addPathPatterns("/owner/**");
        registry.addInterceptor(new AdminInterceptor()).addPathPatterns("/admin/**");
    }

}
