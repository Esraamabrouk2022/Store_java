package com.company.Dao;

import com.company.Model.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityDao {

    public int intsert(City city) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            Statement stat = connection.createStatement();
            String sqlQuaray = "INSERT INTO `cities` (`id = ?`, `name = ?`)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuaray);
            preparedStatement.setInt(1, city.getId());
            preparedStatement.setString(2, city.getName());
            numofAffectedRow = preparedStatement.executeUpdate(sqlQuaray);
            preparedStatement.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return numofAffectedRow;
    }

    public int update(City city, int id) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            String sqlQuery = "UPDATE cities SET name = ? WHERE id =" + id + ";";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, city.getId());
            preparedStatement.setString(2, city.getName());
            numofAffectedRow = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return numofAffectedRow;
    }


    public int Delete(int id) throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "Delete From `cities` where id= '" + id + "' ;";
        int numofAffectedRow = stat.executeUpdate(sqlQuaray);
        return numofAffectedRow;
    }

    public List<City> Selectall() throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `cities`` WHERE 1 ;";
        List<City> allcity = new ArrayList<>();
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        while (resultSet.next()) {
            City city = new City();
            city.setId(resultSet.getInt("id"));
            city.setName(resultSet.getString("name"));
            allcity.add(city);
        }

        return allcity;
    }

    public City Select(int id) throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `cities` WHERE id= '" + id + "' ;";
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        if (resultSet.next()) {
            City city = new City();
            city.setId(resultSet.getInt("id"));
            city.setName(resultSet.getString("name"));
            return city;
        } else return null;
    }
}
