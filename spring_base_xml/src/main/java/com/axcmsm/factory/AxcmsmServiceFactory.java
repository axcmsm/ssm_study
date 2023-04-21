package com.axcmsm.factory;

import com.axcmsm.dao.AxcmsmDao;
import com.axcmsm.dao.Impl.AxcmsmDaoImpl;
import com.axcmsm.service.AxcmsmService;
import com.axcmsm.service.Impl.AxcmsmServiceImpl;

/**
 * ClassName: com.axcmsm.factory.AxcmsmDaoFactory
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/20
 */
public class AxcmsmServiceFactory {
    public static AxcmsmService getAxcmsmService(){
        System.out.println("静态工厂=> factory setup...");
        return new AxcmsmServiceImpl();
    }
    public AxcmsmService getAxcmsm(){
        System.out.println("实例化工厂 => factory setup...");
        return new AxcmsmServiceImpl();
    }
}
