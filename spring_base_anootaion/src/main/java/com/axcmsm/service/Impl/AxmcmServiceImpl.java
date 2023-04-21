package com.axcmsm.service.Impl;

import com.axcmsm.dao.AxcmsmDao;
import com.axcmsm.service.AxcmsmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: com.axcmsm.service.Impl.AxmcmServiceImpl
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/21
 */
@Service
public class AxmcmServiceImpl implements AxcmsmService {

    @Autowired
    @Qualifier("axcmsmDao")
    private AxcmsmDao axcmsmDao;
//    public void setAxcmsmDao(AxcmsmDao axcmsmDao) {
//        this.axcmsmDao = axcmsmDao;
//    }

    @Override
    public void save() {
        System.out.println("业务层调用...");
        this.axcmsmDao.save();
    }

    @Override
    public Boolean openURL(String url, String password) {
        return password.equals("axcmsm");
    }

    @Override
    public void transfer(String out, String in, Double money) {
        System.out.println("转账操作");
    }
}
