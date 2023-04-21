package com.axcmsm.config;

import com.axcmsm.interceptor.ProjectInterceptor;
import com.axcmsm.interceptor.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName: com.axcmsm.config.SpringMvcConfig
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/21
 */
@Configuration
@ComponentScan({"com.axcmsm"})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
    @Autowired
    protected ProjectInterceptor interceptor;
    @Autowired
    protected ProjectInterceptor2 interceptor2;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/page/**").addResourceLocations("/pages/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //.order(1) 可以使用order 调整默认是0 ，从上往下
        registry.addInterceptor(interceptor).addPathPatterns("/hello");
        registry.addInterceptor(interceptor2).addPathPatterns("/hello");
    }
}
