package com.axcmsm.mapper;

import com.axcmsm.pojo.OrderCart;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: com.axcmsm.mapper.OrderCartMapper
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/21
 */
public interface OrderCartMapper {
    @Select("select * from order_cart")
    List<OrderCart> findAll();
}
