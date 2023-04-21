package com.axcmsm;

import com.axcmsm.config.SpringConfig;
import com.axcmsm.dao.AxcmsmDao;
import com.axcmsm.mapper.OrderCartMapper;
import com.axcmsm.pojo.OrderCart;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * ClassName: com.axcmsm.Test
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class Test {

    @Autowired
    private OrderCartMapper orderCartMapper;

    @org.junit.Test
    public void test(){
        List<OrderCart> all = orderCartMapper.findAll();
        all.forEach(System.out::println);
    }

}
