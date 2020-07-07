package com.swift.bean.dto;

/**
 * created by swift
 * 2019/12/5 21:15
 */
public class BillDTO {
    private int key;
    private int id_user;
    private float traffic;
    private float hotel;
    private float other;
    private String routeName;
    private String end_time;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
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

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
}
