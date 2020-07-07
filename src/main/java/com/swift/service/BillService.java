package com.swift.service;

import com.swift.bean.Bill;
import com.swift.bean.dto.BillDTO;
import com.swift.dao.IBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by swift
 * 2019/11/29 22:37
 */
@Service
public class BillService {
    @Autowired
    private IBill bill;

    public void insert(Bill target) {
        bill.insert(target);
    }

    public List<BillDTO> getMyBill(int userId) {
        return bill.getMyBill(userId);
    }

    public Bill getBill(int userId, int routeId) {
        return bill.getBill(userId, routeId);
    }

    public void delBill(int id) {
        bill.delBill(id);
    }
}
