package com.axcmsm.factory;

import com.axcmsm.service.AxcmsmService;
import com.axcmsm.service.Impl.AxcmsmServiceImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * ClassName: com.axcmsm.factory.AxcmsmServiceFactoryBean
 * 微信公众号：代码飞快
 * Description:第四种配置方式
 * 使用spring提供的工厂来，实现我们的方法三：根据实例工厂获取bean
 *
 * @author 须贺
 * @version 2023/4/20
 */
public class AxcmsmServiceFactoryBean implements FactoryBean<AxcmsmService> {
    //代替原始实例工厂中创建对象的方法
    @Override
    public AxcmsmService getObject() throws Exception {
        System.out.println("使用了FactoryBean来实例化对象.。..(实用用)");
        return new AxcmsmServiceImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return AxcmsmService.class;
    }

    @Override
    public boolean isSingleton() {

        //return false;//非单例
        return true;//单例(默认)
    }
}
