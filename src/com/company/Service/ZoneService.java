package com.company.Service;

import com.company.Model.Zones;

import java.sql.*;
import java.util.List;

public interface ZoneService {

    public int intsert(Zones zones) throws SQLException, ClassNotFoundException ;

    public int update(Zones zones, int id) throws SQLException, ClassNotFoundException;

    public int Delete(int id) throws SQLException, ClassNotFoundException ;

    public List<Zones> Selectall() throws SQLException, ClassNotFoundException ;

    public Zones Select(int id) throws SQLException, ClassNotFoundException ;
}
