package com.company.Service;

import com.company.Model.City;

import java.sql.SQLException;
import java.util.List;

public interface CityService {

    public int intsert(com.company.Model.City city) throws SQLException, ClassNotFoundException;
    public int update(com.company.Model.City city, int id) throws SQLException, ClassNotFoundException;
    public int Delete(int id) throws SQLException, ClassNotFoundException;
    public List<com.company.Model.City> Selectall() throws SQLException, ClassNotFoundException;
    public City Select(int id) throws SQLException, ClassNotFoundException;

}
