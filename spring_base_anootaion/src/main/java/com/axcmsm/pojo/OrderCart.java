package com.axcmsm.pojo;


import java.sql.Timestamp;
import java.util.Objects;

/**
 * ClassName: com.axcmsm.pojo.order_cart
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/21
 */

public class OrderCart {
    private Integer cart_id;
    private Integer customer_id;
    private Integer product_id;
    private Integer product_amount;
    private Double price;
    private String add_time;
    private Timestamp modified_time;





    @Override
    public String toString() {
        return "OrderCart{" +
                "cart_id=" + cart_id +
                ", customer_id=" + customer_id +
                ", product_id=" + product_id +
                ", product_amount=" + product_amount +
                ", price=" + price +
                ", add_time='" + add_time + '\'' +
                ", modified_time=" + modified_time +
                '}';
    }

    public Integer getCart_id() {
        return cart_id;
    }

    public void setCart_id(Integer cart_id) {
        this.cart_id = cart_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getProduct_amount() {
        return product_amount;
    }

    public void setProduct_amount(Integer product_amount) {
        this.product_amount = product_amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAdd_time() {
        return add_time;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }

    public Timestamp getModified_time() {
        return modified_time;
    }

    public void setModified_time(Timestamp modified_time) {
        this.modified_time = modified_time;
    }
}
