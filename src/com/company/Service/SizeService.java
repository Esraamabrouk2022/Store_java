package com.company.Service;

import com.company.Model.Sizes;

import java.sql.*;
import java.util.List;

public interface SizeService {

    public int intsert(Sizes sizes) throws SQLException, ClassNotFoundException ;

    public int update(Sizes sizes, int id) throws SQLException, ClassNotFoundException ;

    public int Delete(int id) throws SQLException, ClassNotFoundException ;

    public List<Sizes> Selectall() throws SQLException, ClassNotFoundException ;

    public Sizes Select(int id) throws SQLException, ClassNotFoundException ;
}
