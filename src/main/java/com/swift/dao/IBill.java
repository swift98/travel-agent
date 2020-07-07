package com.swift.dao;

import com.swift.bean.Bill;
import com.swift.bean.dto.BillDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * created by swift
 * 2019/11/29 22:17
 */
@Repository
public interface IBill {
    @Insert("insert into bill(id_user, id_route, traffic, hotel," +
            " other, end_time) values(#{bill.id_user}, #{bill.id_route}," +
            " #{bill.traffic}, #{bill.hotel}, #{bill.other}, #{bill.end_time})")
    public void insert(@Param("bill") Bill bill);

    @Select("select * from (SELECT b.id as 'key', b.id_user, b.traffic," +
            " b.hotel, b.other, r.name as routeName," +
            " DATE_FORMAT(b.end_time,'%Y-%m-%d') as end_time " +
            "from bill b left join route r on b.id_route=r.id) tmp " +
            "where tmp.id_user=#{userId}")
    public List<BillDTO> getMyBill(int userId);

    @Select("select * from bill where id_user=#{userId} and id_route=#{routeId} " +
            "order by end_time desc limit 1")
    public Bill getBill(int userId, int routeId);

    @Delete("delete from bill where id=#{id}")
    public void delBill(int id);
}
