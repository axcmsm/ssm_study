package com.axcmsm.dao.Impl;

import com.axcmsm.dao.AxcmsmDao;

/**
 * ClassName: com.axcmsm.dao.Impl.AxcmsmDao
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/20
 */
public class AxcmsmDaoImpl implements AxcmsmDao {

    private String name;
    public void setName(String name) {
        this.name = name;
    }
    private Integer age;
    private AxcmsmDaoImpl(Integer age){
        this.age=age;
    }


    private AxcmsmDaoImpl(){
        System.out.println("==========(常用)");
        System.out.println("我擦,这个私有构造器,你也能去调用,你这家伙,指定用了反射");
        System.out.println("而且,还只能调用无参构造器,有参的,还给我抛出了 => No default constructor found; nested exception is java.lang.NoSuchMethodException");
        System.out.println("报错,应该从下往上阅读,最上面的是最详细的");
        System.out.println("===================");
    }
    @Override
    public void save() {
        System.out.println("axcmsm dao save");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    //bean初始化调用的方法
    public void init(){
        System.out.println("bean初始化调用的方法");
    }
    //bean销毁前调用方法
    public void destory(){
        System.out.println("bean销毁前调用方法");
    }
}
