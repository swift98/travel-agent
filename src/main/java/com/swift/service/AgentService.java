package com.swift.service;

import com.swift.bean.Agent;
import com.swift.dao.IAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by swift
 * 2019/11/29 14:45
 */
@Service
public class AgentService {
    @Autowired
    private IAgent agent;

    public void register(String name, String address, String phone, String password) {
        agent.register(name, address, phone, password);
    }

    public int getUserByPhone(String phone) {
        return agent.getUserByPhone(phone);
    }

    public Agent login(String phone, String password) {
        return agent.login(phone, password);
    }
}
