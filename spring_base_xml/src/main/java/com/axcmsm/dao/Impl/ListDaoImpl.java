package com.axcmsm.dao.Impl;

import com.axcmsm.dao.ListDao;

import java.util.*;

/**
 * ClassName: com.axcmsm.dao.Impl.ListDaoImpl
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/21
 */
public class ListDaoImpl implements ListDao {
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println("=====================save");
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("properties = " + properties);
    }
}
