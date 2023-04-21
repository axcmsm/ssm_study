package com.axcmsm.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * ClassName: com.axcmsm.config.ServletInitConfig
 * 微信公众号：代码飞快
 * Description:
 * 定义Servlet容器启动的配置类，在里面加载spring的配置
 * @author 须贺
 * @version 2023/4/21
 */
public class ServletInitConfig extends AbstractDispatcherServletInitializer {

    /**
     * 加载springmvc容器配置
     * @return
     */
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    /**
     * 设置哪些请求归宿springmvc处理
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};//所有请求
    }

    /**
     * 加载spring容器处理
     * @return
     */
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

    /**
     * 乱码处理，过滤器
     * @return
     */
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}
