package com.company.Service;

import com.company.Dao.SizeDao;
import com.company.Model.Sizes;

import java.sql.SQLException;
import java.util.List;

public class SizeerviceImp implements SizeService{
    SizeDao sizeDao=new SizeDao();
    @Override
    public int intsert(Sizes sizes) throws SQLException, ClassNotFoundException {
        return sizeDao.intsert(sizes);
    }

    @Override
    public int update(Sizes sizes, int id) throws SQLException, ClassNotFoundException {
        return sizeDao.update(sizes,id);
    }

    @Override
    public int Delete(int id) throws SQLException, ClassNotFoundException {
        return sizeDao.Delete(id);
    }

    @Override
    public List<Sizes> Selectall() throws SQLException, ClassNotFoundException {
        return sizeDao.Selectall();
    }

    @Override
    public Sizes Select(int id) throws SQLException, ClassNotFoundException {
        return sizeDao.Select(id);
    }
}
