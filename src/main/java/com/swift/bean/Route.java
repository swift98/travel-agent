package com.swift.bean;

/**
 * created by swift
 * 2019/12/6 21:41
 */
public class Route {
    private int id;
    private int id_company;
    private String name;
    private String flight;
    private float flightPrice;
    private String hotel;
    private float hotelPrice;
    private String time;
    private int period;
    private float other;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_company() {
        return id_company;
    }

    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public float getOther() {
        return other;
    }

    public void setOther(float other) {
        this.other = other;
    }

    public float getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(float flightPrice) {
        this.flightPrice = flightPrice;
    }

    public float getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(float hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
