package com.company.Service;

import java.sql.SQLException;
import java.util.List;

public interface CategoryService {
    public int intsert(com.company.Model.Category category) throws SQLException, ClassNotFoundException;
    public int update(com.company.Model.Category category, int id) throws SQLException, ClassNotFoundException;
    public int Delete(int id) throws SQLException, ClassNotFoundException;
    public List<com.company.Model.Category> Selectall() throws SQLException, ClassNotFoundException;
    public com.company.Model.Category Select(int id) throws SQLException, ClassNotFoundException;


}
