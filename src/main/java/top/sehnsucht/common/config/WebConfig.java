package top.sehnsucht.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/9
 * ~~(^_^)~~
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Autowired
    @Qualifier(value = "loginInterceptor")
    private HandlerInterceptor handlerInterceptor;

    /**
     * 注册拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(handlerInterceptor);
        //拦截路径
        registration.addPathPatterns("/**");
        //放行路径
        registration.excludePathPatterns(
                "/login",
                "/captcha",
                "/user/login",
                "/user/logout",
                "/layui/**",
                "/lib/**",
                "/spi/**",
                "/css/**",
                "/images/**",
                "/js/**"
                ,"/error"
                ,"/lswagger-ui"
                ,"/lo"

                ,"/swagger**/**"
                ,"/webjars/**"
                ,"/v2/**"
                ,"/favicon.ico"
        );

        WebMvcConfigurer.super.addInterceptors(registry);
    }


}
