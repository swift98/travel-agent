package com.swift.controller;

import com.swift.bean.Bill;
import com.swift.bean.Route;
import com.swift.bean.dto.BillDTO;
import com.swift.bean.dto.RouteDTO;
import com.swift.service.BillService;
import com.swift.service.RouteService;
import com.swift.service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by swift
 * 2019/12/2 16:31
 */
@Controller
@RequestMapping("/route")
public class RouteController {
    @Autowired
    private RouteService routeService;
    @Autowired
    private BillService billService;
    @Autowired
    private SMSService sms;

    @RequestMapping("/allRoutes")
    @ResponseBody
    public List<RouteDTO> getRoutes() {
        return routeService.getRoutes();
    }

    @RequestMapping("/delRoute")
    @ResponseBody
    public Map delRoute(Integer id) {
        Map<Object, Object> map = new HashMap<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date now = df.parse(df.format(new Date()));
            Route route = routeService.getRouteById(id);
            routeService.delRoute(id);
            map.put("success", true);
            map.put("msg", "删除路线成功！");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "发生异常，删除路线失败！");
        }
        return map;
    }

    @RequestMapping("/addRoute")
    @ResponseBody
    public Map addRoute(Integer id_company, String name, String flight,
                        Float flightPrice, String hotel, Float hotelPrice,
                        String time, Integer period, Float other) {
        Map<Object, Object> map = new HashMap<>();
        try {
            routeService.addRoute(id_company, name, flight, flightPrice, hotel, hotelPrice, time, period, other);
            map.put("success", true);
            map.put("msg", "添加路线成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "发生异常，添加路线失败");
        }
        return map;
    }

    @RequestMapping("/modRoute")
    @ResponseBody
    public Map modRoute(Integer id, String name, String flight, Float flightPrice, String hotel, Float hotelPrice, String time, Integer period, Float other) {
        Map<Object, Object> map = new HashMap<>();
        try {
            routeService.modRoute(id, name, flight, flightPrice, hotel, hotelPrice, time, period, other);
            map.put("success", true);
            map.put("msg", "修改路线成功！");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "发生异常，修改路线失败！");
        }
        return map;
    }

    @RequestMapping("/reserve")
    @ResponseBody
    public Map reserve(Integer userId, Integer routeId, String endTime, String phone) {
        Map<Object, Object> map = new HashMap<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date now = df.parse(df.format(new Date()));
            if (now.after(df.parse(endTime))) {
                map.put("success", false);
                map.put("msg", "时间已过，无法预定");
            } else {
                Bill bill = billService.getBill(userId, routeId);
                if (null == bill) {
                    map.put("success", true);
                    map.put("msg", "预定成功");
                    Bill insertBill = new Bill();
                    reserveSuccess(userId, routeId, insertBill, phone);
                } else {
                    map.put("msg", "预定失败，您已预定该线路");
                    map.put("success", false);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "发生异常，请稍后重试");
        }
        return map;
    }

    private void reserveSuccess(Integer userId, Integer routeId, Bill bill, String phone) {
        Route route = routeService.getRouteById(routeId);
        bill.setId_user(userId);
        bill.setId_route(routeId);
        bill.setHotel(route.getHotelPrice() * route.getPeriod());
        bill.setTraffic(route.getFlightPrice());
        bill.setOther(route.getOther());
        bill.setEnd_time(route.getTime());
        billService.insert(bill);
        sms.sendTest(phone, route.getOther());
    }

    @RequestMapping("/myBill")
    @ResponseBody
    public Map getMyBill(Integer userId) {
        Map<Object, Object> map = new HashMap<>();
        try {
            List<BillDTO> bills = billService.getMyBill(userId);
            map.put("bills", bills);
            map.put("success", true);
        } catch(Exception e) {
            e.printStackTrace();
            map.put("success", false);
        }
        return map;
    }

    @RequestMapping("/revoke")
    @ResponseBody
    public Map delBill(Integer id) {
        Map<Object, Object> map = new HashMap<>();
        try {
            billService.delBill(id);
            map.put("success", true);
            map.put("msg", "取消订单成功");
        } catch(Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "发生异常，请稍后再试");
        }
        return map;
    }

    @RequestMapping("/myRoute")
    @ResponseBody
    public Map getMyRoutes(Integer agentId) {
        Map<Object, Object> map = new HashMap<>();
        try {
            List<Route> routes = routeService.getMyRoutes(agentId);
            map.put("success", true);
            map.put("routes", routes);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "发生异常，请稍后再试");
        }
        return map;
    }

    @RequestMapping("/oneRoute")
    @ResponseBody
    public Map getRouteById(Integer id) {
        Map<Object, Object> map = new HashMap<>();
        try {
            Route route = routeService.getRouteById(id);
            map.put("success", true);
            map.put("route", route);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "发生异常，获取路线失败");
        }
        return map;
    }

    @RequestMapping("/searchRoute")
    @ResponseBody
    public Map searchRouteDTO(String keyWord) {
        Map<Object, Object> map = new HashMap<>();
        try {
            keyWord = "%" + keyWord + "%";
            List<RouteDTO> routes = routeService.searchRouteDTO(keyWord);
            map.put("success", true);
            map.put("routes", routes);
        } catch(Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "发生异常，搜索路线失败");
        }
        return map;
    }
}
