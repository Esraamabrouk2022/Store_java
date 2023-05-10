package com.company.rebo;

import com.company.dp.entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRebo {

    public int intsert(Product product) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            Statement stat = connection.createStatement();
            String sqlQuaray = "INSERT INTO `products` (" +
                    "`id = ?`, " +
                    "'categorey_id= ? ,'" +
                    "'name= ? ,'" +
                    "'descriotion= ? ,'" +
                    "`picture_path = ?`)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuaray);
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setInt(2, product.getCategorey_id());
            preparedStatement.setString(3, product.getName());
            preparedStatement.setString(4, product.getDescriotion());
            preparedStatement.setString(5, product.getPicture_path());
            numofAffectedRow = preparedStatement.executeUpdate(sqlQuaray);
            preparedStatement.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return numofAffectedRow;
    }

    public int update(Product product, int id) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            Statement stat = connection.createStatement();
            String sqlQuaray = "UPDATE  products SET " +
                    "id = '" + product.getId() +
                    "' ,category_id = '" + product.getCategorey_id() +
                    "', name= '" + product.getName() +
                    "',descriotion = '" + product.getDescriotion() +
                    "', picture_path = '" + product.getPicture_path() +
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
        String sqlQuaray = "Delete From `products` where id= '" + id + "' ;";
        int numofAffectedRow = stat.executeUpdate(sqlQuaray);
        return numofAffectedRow;
    }

    public List<Product> Selectall() throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `products`` WHERE 1 ;";
        List<Product> allProduct = new ArrayList<>();
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        while (resultSet.next()) {
            Product product = new Product();
            product.setId(resultSet.getInt("id"));
            product.setId(resultSet.getInt("categorey_id"));
            product.setName(resultSet.getString("name"));
            product.setDescriotion(resultSet.getString("descriotion"));
            product.setPicture_path(resultSet.getString("picture_path"));
            allProduct.add(product);
        }

        return allProduct;
    }

    public Product Select(int id) throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `products` WHERE id= '" + id + "' ;";
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        if (resultSet.next()) {
            Product product = new Product();
            product.setId(resultSet.getInt("id"));
            product.setId(resultSet.getInt("categorey_id"));
            product.setName(resultSet.getString("name"));
            product.setDescriotion(resultSet.getString("descriotion"));
            product.setPicture_path(resultSet.getString("picture_path"));
            return product;
        } else return null;
    }
}
