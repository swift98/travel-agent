package com.swift.service;

import com.swift.bean.Visitor;
import com.swift.dao.IVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by swift
 * 2019/11/29 14:45
 */
@Service
public class VisitorService {
    @Autowired
    private IVisitor visitor;

    public void register(String name, String sex, String card, String phone, String password) {
        visitor.register(name, sex, card, phone, password);
    }

    public int getUserByPhone(String phone) {
        return visitor.getUserByPhone(phone);
    }

    public Visitor login(String phone, String password) {
        return visitor.login(phone, password);
    }
}
