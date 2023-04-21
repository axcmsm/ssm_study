package com.axcmsm.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * ClassName: com.axcmsm.service.AxcmsmService
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/21
 */
public interface AxcmsmService {
    void save();

    Boolean openURL(String url,String password);

    @Transactional(rollbackFor = IOException.class)
    public void transfer(String out,String in,Double money);
}
