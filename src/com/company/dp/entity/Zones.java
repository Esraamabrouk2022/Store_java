package com.company.dp.entity;

public class Zones {
    int id;
    int city_id;
    String name;
    String zonescol;

    public Zones() {
    }

    public Zones(int id, int city_id, String name, String zonescol) {
        this.id = id;
        this.city_id = city_id;
        this.name = name;
        this.zonescol = zonescol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZonescol() {
        return zonescol;
    }

    public void setZonescol(String zonescol) {
        this.zonescol = zonescol;
    }
}
