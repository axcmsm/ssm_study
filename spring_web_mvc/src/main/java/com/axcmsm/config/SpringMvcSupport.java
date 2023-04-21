package com.axcmsm.config;

import com.axcmsm.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * ClassName: com.axcmsm.config.SpringMvcSupport
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/21
 */
//@Configuration
//public class SpringMvcSupport extends WebMvcConfigurationSupport {
//    @Autowired
//    protected ProjectInterceptor interceptor;
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/page/**").addResourceLocations("/pages/");
//    }
//
//    @Override
//    protected void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(interceptor).addPathPatterns("/books/*");
//    }
//}
