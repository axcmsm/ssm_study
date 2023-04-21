package com.axcmsm.service.Impl;

import com.axcmsm.dao.AxcmsmDao;
import com.axcmsm.dao.Impl.AxcmsmDaoImpl;
import com.axcmsm.service.AxcmsmService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * ClassName: com.axcmsm.service.Impl.AxcmsmServiceImpl
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/20
 */
public class AxcmsmServiceImpl implements AxcmsmService, InitializingBean, DisposableBean {

    //private AxcmsmDao axcmsmDao=new AxcmsmDaoImpl();

    //使用DI的方式注入对象
    private AxcmsmDao axcmsmDao;
    //使用set的方式进行注入
    public void setAxcmsmDao(AxcmsmDao axcmsmDao) {
        this.axcmsmDao = axcmsmDao;
        System.out.println("注入对象成功！");
    }

    @Override
    public void save(){
        System.out.println("Axcmsm service save");
        axcmsmDao.save();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁方法：service");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("属性设置之后调用：service");
    }
}
