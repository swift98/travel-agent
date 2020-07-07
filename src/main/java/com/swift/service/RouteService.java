package com.swift.service;

import com.swift.bean.Route;
import com.swift.bean.dto.RouteDTO;
import com.swift.dao.IRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by swift
 * 2019/12/2 16:20
 */
@Service
public class RouteService {
    @Autowired
    private IRoute route;

    public List<RouteDTO> getRoutes() {
        return route.getRoutes();
    }

    public void delRoute(int id) {
        route.delRoute(id);
    }

    public void addRoute(Integer id_company, String name, String flight,
                         Float flightPrice, String hotel, Float hotelPrice,
                         String time, Integer period, Float other) {
        route.addRoute(id_company, name, flight, flightPrice, hotel, hotelPrice, time, period, other);
    }

    public void modRoute(int id, String name, String flight,
                         float flightPrice, String hotel, float hotelPrice,
                         String time, int period, float other) {
        route.modRoute(id, name, flight, flightPrice, hotel, hotelPrice, time, period, other);
    }

    public Route getRouteById(int routeId) {
        return route.getRouteById(routeId);
    }

    public List<Route> getMyRoutes(int agentId) {
        return route.getMyRoutes(agentId);
    }

    public List<RouteDTO> searchRouteDTO(String keyWord) {
        return route.searchRouteDTO(keyWord);
    }
}
