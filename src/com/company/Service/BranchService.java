package com.company.Service;

import java.sql.SQLException;
import java.util.List;

public interface BranchService {
    public int intsert(com.company.Model.Branch branch) throws SQLException, ClassNotFoundException;
    public int update(com.company.Model.Branch branch, int id) throws SQLException, ClassNotFoundException;
    public int Delete(int id) throws SQLException, ClassNotFoundException;
    public List<com.company.Model.Branch> Selectall() throws SQLException, ClassNotFoundException;
    public com.company.Model.Branch Select(int id) throws SQLException, ClassNotFoundException;

}
