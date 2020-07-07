package com.swift.dao;

import com.swift.bean.Visitor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * created by swift
 * 2019/11/29 10:58
 */

@Repository
public interface IVisitor {
    @Insert("insert into visitor(name, sex, card, phone, password) values(" +
            "#{name}, #{sex}, #{card}, #{phone}, #{password})")
    public void register(String name, String sex, String card, String phone, String password);

    @Select("select IFNULL(max(id), -1) from visitor where phone=#{phone}")
    public int getUserByPhone(String phone);

    @Select("select * from visitor where phone=#{phone} and password=#{password}")
    public Visitor login(String phone, String password);
}
