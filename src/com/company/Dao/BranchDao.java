package com.company.Dao;

import com.company.Model.Branch;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BranchDao {

    public int intsert(Branch branch) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            Statement stat = connection.createStatement();
            String sqlQuaray = "INSERT INTO `branches` (" +
                    "`id = ?`," +
                    "'zone_id = ?'," +
                    " `name= ?`," +
                    " 'building_name = ?'," +
                    "'street_name = ?'" +
                    "'working_start = ?'" +
                    "'working_end = ?'" +
                    "'telephonel =?')";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuaray);
            preparedStatement.setInt(1, branch.getId());
            preparedStatement.setInt(2, branch.getZone_id());
            preparedStatement.setString(3, branch.getName());
            preparedStatement.setString(4, branch.getBuilding_name());
            preparedStatement.setString(5, branch.getStreet_name());
            preparedStatement.setString(6, branch.getWorking_start());
            preparedStatement.setString(7, branch.getWorking_end());
            preparedStatement.setString(8, branch.getTelephonel());
            numofAffectedRow = stat.executeUpdate(sqlQuaray);
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return numofAffectedRow;

    }

    public int update(Branch branch, int id) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            Statement stat = connection.createStatement();
            String sqlQuaray = "UPDATE `branches` SET " +
                    "id = '" + branch.getId() +
                    "', zone_id  = '" + branch.getZone_id() +
                    "', name  = '" + branch.getName() +
                    "', building_name  = '" + branch.getBuilding_name() +
                    "', street_name = '" + branch.getStreet_name() +
                    "', working_start = '" + branch.getWorking_start() +
                    "', working_end = '" + branch.getWorking_end() +
                    "', telephonel = '" + branch.getTelephonel() +
                    "' WHERE id = '" + id + "' ;";
            numofAffectedRow = stat.executeUpdate(sqlQuaray);
            stat.close();
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
        String sqlQuaray = "Delete From `branches` where id= '" + id + "' ;";
        int numofAffectedRow = stat.executeUpdate(sqlQuaray);
        return numofAffectedRow;
    }

    public List<Branch> Selectall() throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `branches` WHERE 1 ;";
        List<Branch> allbranchies = new ArrayList<>();
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        while (resultSet.next()) {
            Branch branch = new Branch();
            branch.setId(resultSet.getInt("id"));
            branch.setZone_id(resultSet.getInt("zone_id"));
            branch.setName(resultSet.getString("name"));
            branch.setBuilding_name(resultSet.getString(" building_name"));
            branch.setStreet_name(resultSet.getString("street_name"));
            branch.setWorking_start(resultSet.getString("working_start"));
            branch.setWorking_end(resultSet.getString("working_end"));
            branch.setTelephonel(resultSet.getString("telephonel"));

            allbranchies.add(branch);
        }

        return allbranchies;
    }

    public Branch Select(int id) throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `branches` WHERE id= '" + id + "' ;";
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        if (resultSet.next()) {
            Branch branch = new Branch();
            branch.setId(resultSet.getInt("id"));
            branch.setZone_id(resultSet.getInt("zone_id"));
            branch.setName(resultSet.getString("name"));
            branch.setBuilding_name(resultSet.getString(" building_name"));
            branch.setStreet_name(resultSet.getString("street_name"));
            branch.setWorking_start(resultSet.getString("working_start"));
            branch.setWorking_end(resultSet.getString("working_end"));
            branch.setTelephonel(resultSet.getString("telephonel"));
            return branch;
        } else return null;
    }


}
