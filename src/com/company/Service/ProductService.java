package com.company.Service;


import java.sql.*;

import java.util.List;

public interface ProductService {
    public int intsert(com.company.Model.Product product) throws SQLException, ClassNotFoundException ;

    public int update(com.company.Model.Product product, int id) throws SQLException, ClassNotFoundException ;

    public int Delete(int id) throws SQLException, ClassNotFoundException ;

    public List<com.company.Model.Product> Selectall() throws SQLException, ClassNotFoundException ;

    public com.company.Model.Product Select(int id) throws SQLException, ClassNotFoundException ;
}
