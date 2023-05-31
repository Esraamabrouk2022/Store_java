package com.company.Dao;

import com.company.Model.Brand;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BrandDao {
    public int insert(Brand brand) {
        int numOfAffectedRows = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            String sqlQuery = "INSERT INTO `brand` (`id`, `name`, `logo_path`) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, brand.getId());
            preparedStatement.setString(2, brand.getName());
            preparedStatement.setString(3, brand.getLogo_path());
            numOfAffectedRows = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return numOfAffectedRows;
    }

    public int update(Brand brand, int id) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            String sqlQuery = "UPDATE `brand` SET id=?, name=?, logo_path=? WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, brand.getId());
            preparedStatement.setString(2, brand.getName());
            preparedStatement.setString(3, brand.getLogo_path());
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
        String sqlQuaray = "Delete From `categories` where id= '" + id + "' ;";
        int numofAffectedRow = stat.executeUpdate(sqlQuaray);
        return numofAffectedRow;
    }

    public List<Brand> Selectall() throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        PreparedStatement stat = (PreparedStatement) connection.createStatement();
        String sqlQuaray = "SELECT * FROM `brand` WHERE 1 ;";
        List<Brand> allBrand = new ArrayList<>();
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        while (resultSet.next()) {
            Brand brand = new Brand();
            brand.setId(resultSet.getInt("id"));
            brand.setName(resultSet.getString("name"));
            brand.setLogo_path(resultSet.getString("logo_path"));
            allBrand.add(brand);
        }
        return allBrand;
    }

    public Brand Select(int id) throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `brand` WHERE id= '" + id + "' ;";
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        if (resultSet.next()) {
            Brand brand = new Brand();
            brand.setId(resultSet.getInt("id"));
            brand.setName(resultSet.getString("name"));
            brand.setLogo_path(resultSet.getString("logo_path"));
            return brand;
        } else return null;
    }


}
