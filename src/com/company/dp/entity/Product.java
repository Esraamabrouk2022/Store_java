package com.company.dp.entity;

public class Product {
    int id;
    int categorey_id;
    String name;
    String descriotion;
    String picture_path;

    public Product() {
    }

    public Product(int id, int categorey_id, String name, String descriotion, String picture_path) {
        this.id = id;
        this.categorey_id = categorey_id;
        this.name = name;
        this.descriotion = descriotion;
        this.picture_path = picture_path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategorey_id() {
        return categorey_id;
    }

    public void setCategorey_id(int categorey_id) {
        this.categorey_id = categorey_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriotion() {
        return descriotion;
    }

    public void setDescriotion(String descriotion) {
        this.descriotion = descriotion;
    }

    public String getPicture_path() {
        return picture_path;
    }

    public void setPicture_path(String picture_path) {
        this.picture_path = picture_path;
    }
}
