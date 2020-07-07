package com.swift.bean;

/**
 * created by swift
 * 2019/11/29 22:13
 */
public class Bill {
    private int id;
    private int id_user;
    private int id_route;
    private float traffic;
    private float hotel;
    private float other;
    private String end_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_route() {
        return id_route;
    }

    public void setId_route(int id_route) {
        this.id_route = id_route;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public float getTraffic() {
        return traffic;
    }

    public void setTraffic(float traffic) {
        this.traffic = traffic;
    }

    public float getHotel() {
        return hotel;
    }

    public void setHotel(float hotel) {
        this.hotel = hotel;
    }

    public float getOther() {
        return other;
    }

    public void setOther(float other) {
        this.other = other;
    }
}
