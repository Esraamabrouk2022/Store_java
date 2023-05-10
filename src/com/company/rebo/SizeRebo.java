package com.company.rebo;

import com.company.dp.entity.City;
import com.company.dp.entity.Sizes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SizeRebo {

    public int intsert(Sizes sizes) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            Statement stat = connection.createStatement();
            String sqlQuaray = "INSERT INTO `sizes` (`id = ?`, `name = ?`)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuaray);
            preparedStatement.setInt(1, sizes.getId());
            preparedStatement.setString(2, sizes.getName());
            numofAffectedRow = preparedStatement.executeUpdate(sqlQuaray);
            preparedStatement.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return numofAffectedRow;
    }

    public int update(Sizes sizes, int id) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            Statement stat = connection.createStatement();
            String sqlQuaray = "UPDATE sizes SET id = '" + sizes.getId() + "' ,name = '" + sizes.getName() + "' WHERE id = '" + id + "' ;";
            numofAffectedRow = stat.executeUpdate(sqlQuaray);
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
        String sqlQuaray = "Delete From `sizes` where id= '" + id + "' ;";
        int numofAffectedRow = stat.executeUpdate(sqlQuaray);
        return numofAffectedRow;
    }

    public List<Sizes> Selectall() throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `sizes`` WHERE 1 ;";
        List<Sizes> allSizes = new ArrayList<>();
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        while (resultSet.next()) {
            Sizes sizes = new Sizes();
            sizes.setId(resultSet.getInt("id"));
            sizes.setName(resultSet.getString("name"));
            allSizes.add(sizes);
        }
        return allSizes;
    }

    public Sizes Select(int id) throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `sizes` WHERE id= '" + id + "' ;";
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        if (resultSet.next()) {
            Sizes sizes = new Sizes();
            sizes.setId(resultSet.getInt("id"));
            sizes.setName(resultSet.getString("name"));
            return sizes;
        } else return null;
    }


}
