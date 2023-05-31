package com.company.Dao;

import com.company.BasicRebo;
import com.company.Model.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategotiesDao extends BasicRebo {
    public int intsert(Category category) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            String sqlQuaray = "INSERT INTO `categories` (`id`, `name`, `description`) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuaray);
            preparedStatement.setInt(1, category.getId());
            preparedStatement.setString(2, category.getName());
            preparedStatement.setString(3, category.getDescribtion());
            numofAffectedRow = preparedStatement.executeUpdate(sqlQuaray);
            preparedStatement.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return numofAffectedRow;
    }

    public int update(Category category, int id) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            String sqlQuery = "UPDATE categories SET id = ?, name = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, category.getId());
            preparedStatement.setString(2, category.getName());
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

    public List<Category> Selectall() throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `categories` WHERE 1 ;";
        List<Category> allcategories = new ArrayList<>();
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        while (resultSet.next()) {
            Category category = new Category();
            category.setId(resultSet.getInt("id"));
            category.setName(resultSet.getString("name"));
            category.setDescribtion(resultSet.getString("description"));
            allcategories.add(category);
        }

        return allcategories;
    }

    public Category Select(int id) throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `categories` WHERE id= '" + id + "' ;";
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        if (resultSet.next()) {
            Category category = new Category();
            category.setId(resultSet.getInt("id"));
            category.setName(resultSet.getString("name"));
            category.setDescribtion(resultSet.getString("description"));
            return category;
        } else return null;
    }
}
