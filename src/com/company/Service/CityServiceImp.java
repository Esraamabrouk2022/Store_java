package com.company.Service;

import com.company.Dao.CityDao;
import com.company.Model.City;

import java.sql.SQLException;
import java.util.List;

public class CityServiceImp implements CityService{
    CityDao cityDao=new CityDao();
    @Override
    public int intsert(City city) throws SQLException, ClassNotFoundException {
        return cityDao.intsert(city);
    }

    @Override
    public int update(City city, int id) throws SQLException, ClassNotFoundException {
        return cityDao.update(city,id);
    }

    @Override
    public int Delete(int id) throws SQLException, ClassNotFoundException {
        return cityDao.Delete(id);
    }

    @Override
    public List<City> Selectall() throws SQLException, ClassNotFoundException {
        return cityDao.Selectall();
    }

    @Override
    public City Select(int id) throws SQLException, ClassNotFoundException {
        return  cityDao.Select(id);
    }
}
