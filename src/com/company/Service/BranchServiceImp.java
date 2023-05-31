package com.company.Service;

import com.company.Dao.BranchDao;
import com.company.Model.Branch;

import java.sql.SQLException;
import java.util.List;

public class BranchServiceImp implements BranchService{
    BranchDao branchDao=new BranchDao();
    @Override
    public int intsert(Branch branch) throws SQLException, ClassNotFoundException {
        return branchDao.intsert(branch);
    }

    @Override
    public int update(Branch branch, int id) throws SQLException, ClassNotFoundException {
        return branchDao.update(branch,id);
    }

    @Override
    public int Delete(int id) throws SQLException, ClassNotFoundException {
        return branchDao.Delete(id);
    }

    @Override
    public List<Branch> Selectall() throws SQLException, ClassNotFoundException {
        return branchDao.Selectall();
    }

    @Override
    public Branch Select(int id) throws SQLException, ClassNotFoundException {
        return branchDao.Select(id);
    }
}
