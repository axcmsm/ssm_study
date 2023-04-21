package com.axcmsm.dao.Impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.axcmsm.dao.AxcmsmDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * ClassName: com.axcmsm.dao.Impl.AxcmsmDaoImpl
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/21
 */
//@Component(value = "axcmsmDao")
@Repository(value = "axcmsmDao")
@Scope("singleton")//非单例prototype，singleton 单例
public class AxcmsmDaoImpl implements AxcmsmDao {

    //@Value("须贺")
    @Value("${jdbc.username}")
    private String name;

    @Autowired
//    @Qualifier("mysql")//可以根据名称获取
    private DataSource dataSource;



    @Override
    public void save() {
        System.out.println("持久层调用save..." + name);
    }

    @Override
    public void list() {
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    @PostConstruct
    public void init() {
        System.out.println("初始化生命周期....");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁前调用");
    }
}
