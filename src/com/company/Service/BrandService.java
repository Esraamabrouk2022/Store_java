package com.company.Service;

import java.sql.SQLException;
import java.util.List;

public interface BrandService {
    public int insert(com.company.Model.Brand brand);
    public int update(com.company.Model.Brand brand, int id) throws SQLException, ClassNotFoundException;
    public int Delete(int id) throws SQLException, ClassNotFoundException;
    public List<com.company.Model.Brand> Selectall() throws SQLException, ClassNotFoundException;
    public com.company.Model.Brand Select(int id) throws SQLException, ClassNotFoundException;


}
