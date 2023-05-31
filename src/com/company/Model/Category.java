package com.company.Model;

public class Category {
    public  int id;
    public String name;
    public String describtion;

    public Category() {
    }

    public Category(int id, String name, String describtion) {
        this.id = id;
        this.name = name;
        this.describtion = describtion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }
}
