package com.company.Model;

import java.sql.Time;

public class Branch {
    int id;
    int zone_id;
    String name;
    String building_name;
    String street_name;
    String working_start;
    String working_end;
    String telephonel;
public Branch(){}
    public Branch(int id, int zone_id, String name, String building_name, String street_name, String working_start, String working_end, String telephonel) {
        this.id = id;
        this.zone_id = zone_id;
        this.name = name;
        this.building_name = building_name;
        this.street_name = street_name;
        this.working_start = working_start;
        this.working_end = working_end;
        this.telephonel = telephonel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getZone_id() {
        return zone_id;
    }

    public void setZone_id(int zone_id) {
        this.zone_id = zone_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getWorking_start() {
        return working_start;
    }

    public void setWorking_start(String working_start) {
        this.working_start = working_start;
    }

    public String getWorking_end() {
        return working_end;
    }

    public void setWorking_end(String working_end) {
        this.working_end = working_end;
    }

    public String getTelephonel() {
        return telephonel;
    }

    public void setTelephonel(String telephonel) {
        this.telephonel = telephonel;
    }
}
