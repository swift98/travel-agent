package com.swift.dao;

import com.swift.bean.Route;
import com.swift.bean.dto.RouteDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * created by swift
 * 2019/12/2 16:03
 */
@Repository
public interface IRoute {
    @Select("select r.id as 'key', r.id_company, r.name, r.flight, r.price_flight as flightPrice," +
            " r.hotel, r.price_hotel as hotelPrice, r.other, " +
            "DATE_FORMAT(r.start_time,'%Y-%m-%d') as time, r.period, " +
            "a.name as agent from route r left join agent a on r.id_company=a.id where r.flag=1")
    public List<RouteDTO> getRoutes();

    @Insert("insert into route values(null, #{id_company}, #{name}, #{flight}, #{flightPrice}, #{hotel}, #{hotelPrice}, #{time}, #{period}, #{other}, null)")
    public void addRoute(Integer id_company, String name, String flight,
                         Float flightPrice, String hotel, Float hotelPrice,
                         String time, Integer period, Float other);

    @Delete("update route set flag=0 where id=#{id}")
    public void delRoute(int id);

    @Update("update route set name=#{name}, flight=#{flight}, price_flight=#{flightPrice}," +
            "hotel=#{hotel}, price_hotel=#{hotelPrice}, start_time=#{time}," +
            "period=#{period}, other=#{other} where id=#{id}")
    public void modRoute(Integer id, String name, String flight,
            Float flightPrice, String hotel, Float hotelPrice,
            String time, Integer period, Float other);

    @Select("select id, id_company, name, flight, price_flight as flightPrice, hotel, price_hotel as hotelPrice, other, DATE_FORMAT(start_time,'%Y-%m-%d') as time, period from route where id=#{routeId} and flag=1")
    public Route getRouteById(int routeId);

    @Select("select id, id_company, name, flight, price_flight as flightPrice, hotel, price_hotel as hotelPrice, other, DATE_FORMAT(start_time,'%Y-%m-%d') as time, period from route WHERE id_company=#{agentId} and flag=1")
    public List<Route> getMyRoutes(int agentId);

    @Select("select r.id as 'key', r.id_company, r.name, r.flight, r.price_flight as flightPrice," +
            " r.hotel, r.price_hotel as hotelPrice, r.other, " +
            "DATE_FORMAT(r.start_time,'%Y-%m-%d') as time, r.period, " +
            "a.name as agent from route r left join agent a on r.id_company=a.id where r.flag=1 and r.name like #{keyWord}")
    public List<RouteDTO> searchRouteDTO(String keyWord);
}
