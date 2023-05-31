package com.company.Dao;

import com.company.Model.Product_size;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductSizeDao {
    public int intsert(Product_size product_size) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            Statement stat = connection.createStatement();
            String sqlQuaray = "INSERT INTO `product_size` (" +
                    "`id = ?`," +
                    "'products_id = ?'," +
                    "`size= ?`," +
                    "'quantity_id = ?'," +
                    "'price = ?'" +
                    ")";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuaray);
            preparedStatement.setInt(1, product_size.getId());
            preparedStatement.setInt(2, product_size.getProducts_id());
            preparedStatement.setInt(3, product_size.getSize());
            preparedStatement.setInt(4, product_size.getQuantity_id());
            preparedStatement.setFloat(5, product_size.getPrice());
            numofAffectedRow = preparedStatement.executeUpdate(sqlQuaray);
            preparedStatement.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return numofAffectedRow;
    }

    public int update(Product_size product_size, int id) throws SQLException, ClassNotFoundException {
        int numofAffectedRow = 0;
        try {
            DbConnectionManger dbConnectionManger = new DbConnectionManger();
            Connection connection = dbConnectionManger.connect();
            Statement stat = connection.createStatement();
            String sqlQuaray = "UPDATE `branches` SET " +
                    " id = '" + product_size.getId() +
                    "',products_id  = '" + product_size.getProducts_id() +
                    "',size  = '" + product_size.getSize() +
                    "',quantity_id  = '" + product_size.getQuantity_id() +
                    "',price  = '" + product_size.getPrice() +
                    "' where id= " + id + ";";
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
        String sqlQuaray = "Delete From `product_size` where id= '" + id + "' ;";
        int numofAffectedRow = stat.executeUpdate(sqlQuaray);
        return numofAffectedRow;
    }

    public List<Product_size> Selectall() throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `product_size` WHERE 1 ;";
        List<Product_size> allproduct = new ArrayList<>();
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        while (resultSet.next()) {
            Product_size product_size = new Product_size();
            product_size.setId(resultSet.getInt("id"));
            product_size.setProducts_id(resultSet.getInt("products_id "));
            product_size.setSizes_id(resultSet.getInt("sizes_id"));
            product_size.setSize(resultSet.getInt("size"));
            product_size.setQuantity_id(resultSet.getInt("quantity_id"));
            product_size.setPrice(resultSet.getFloat("price"));
            allproduct.add(product_size);
        }
        return allproduct;
    }

    public Product_size Select(int id) throws SQLException, ClassNotFoundException {
        DbConnectionManger dbConnectionManger = new DbConnectionManger();
        Connection connection = dbConnectionManger.connect();
        Statement stat = connection.createStatement();
        String sqlQuaray = "SELECT * FROM `product_size` WHERE id= '" + id + "' ;";
        ResultSet resultSet = stat.executeQuery(sqlQuaray);
        if (resultSet.next()) {
            Product_size product_size = new Product_size();
            product_size.setId(resultSet.getInt("id"));
            product_size.setProducts_id(resultSet.getInt("products_id "));
            product_size.setSizes_id(resultSet.getInt("sizes_id"));
            product_size.setSize(resultSet.getInt("size"));
            product_size.setQuantity_id(resultSet.getInt("quantity_id"));
            product_size.setPrice(resultSet.getFloat("price"));
            return product_size;
        } else return null;
    }


}
