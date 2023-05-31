package com.company.Service;

import com.company.Model.Product_size;

import java.sql.*;
import java.util.List;

public interface ProductSizeService {

    public int intsert(Product_size product_size) throws SQLException, ClassNotFoundException ;

    public int update(Product_size product_size, int id) throws SQLException, ClassNotFoundException ;

    public int Delete(int id) throws SQLException, ClassNotFoundException ;

    public List<Product_size> Selectall() throws SQLException, ClassNotFoundException ;

    public Product_size Select(int id) throws SQLException, ClassNotFoundException;


}
