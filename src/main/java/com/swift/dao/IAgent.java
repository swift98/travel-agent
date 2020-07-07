package com.swift.dao;

import com.swift.bean.Agent;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * created by swift
 * 2019/11/29 10:58
 */
@Repository
public interface IAgent {
    @Insert("insert into agent(name, address, phone, password) values(" +
            "#{name}, #{address}, #{phone}, #{password})")
    public void register(String name, String address, String phone, String password);

    @Select("select IFNULL(max(id), -1) from agent where phone=#{phone}")
    public int getUserByPhone(String phone);

    @Select("select * from agent where phone=#{phone} and password=#{password}")
    public Agent login(String phone, String password);
}
