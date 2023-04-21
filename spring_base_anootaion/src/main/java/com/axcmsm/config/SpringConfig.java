package com.axcmsm.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * ClassName: com.axcmsm.config.SpringConfig
 * 微信公众号：代码飞快
 * Description:
 * 配置类，使用该类代替Xml 文件
 *
 * @author 须贺
 * @version 2023/4/21
 */
@Configuration
@ComponentScan(basePackages = "com.axcmsm")
@PropertySource("jdbc.properties")
//除了ComponentScan 扫描到的话
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy//启动注解开发aop
@EnableTransactionManagement
public class SpringConfig {

}
