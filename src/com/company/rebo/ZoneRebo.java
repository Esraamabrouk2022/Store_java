package com.company.rebo;

import com.company.dp.entity.Sizes;
import com.company.dp.entity.Zones;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ZoneRebo {
    public int intsert(Zones zones) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            Statement stat = connection.createStatement();
            String sqlQuaray = "INSERT INTO 'zones' (" +
                    "`id = ?`," +
                    "`zone_id = ?`," +
                    "'zonescol = ?,'" +
                    " `name = ?`)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuaray);
            preparedStatement.setInt(1, zones.getId());
            preparedStatement.setInt(2, zones.getCity_id());
            preparedStatement.setString(3, zones.getName());
            preparedStatement.setString(4, zones.getZonescol());
            numofAffectedRow = preparedStatement.executeUpdate(sqlQuaray);
            preparedStatement.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return numofAffectedRow;
    }

    public int update(Zones zones, int id) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();

            Statement stat = connection.createStatement();
            String sqlQuaray = "UPDATE zones SET " +
                    "id = '" + zones.getId() +
                    ",city_id = '" + zones.getCity_id() +
                    "',name = '" + zones.getName() +
                    "',zonescol = '" + zones.getZonescol() +
                    "' WHERE id = '" + zones.getId() + "' ;";
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
        String sqlQuaray = "Delete From `zones` where id= '" + id + "' ;";
        int numofAffectedRow = stat.executeUpdate(sqlQuaray);
        return numofAffectedRow;
    }

    public List<Zones> Selectall() throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `zones`` WHERE 1 ;";
        List<Zones> allzones = new ArrayList<>();
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        while (resultSet.next()) {
            Zones zones = new Zones();
            zones.setId(resultSet.getInt("id"));
            zones.setId(resultSet.getInt("city_id"));
            zones.setName(resultSet.getString("name"));
            zones.setName(resultSet.getString("zonescol"));
            allzones.add(zones);
        }
        return allzones;
    }

    public Zones Select(int id) throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `zones` WHERE id= '" + id + "' ;";
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        if (resultSet.next()) {
            Zones zones = new Zones();
            zones.setId(resultSet.getInt("id"));
            zones.setId(resultSet.getInt("city_id"));
            zones.setName(resultSet.getString("name"));
            zones.setName(resultSet.getString("zonescol"));
            return zones;
        } else return null;
    }


}
