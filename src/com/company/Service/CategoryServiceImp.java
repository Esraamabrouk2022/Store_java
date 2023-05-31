package com.company.Service;

import com.company.Dao.CategotiesDao;
import com.company.Model.Category;
import java.sql.SQLException;
import java.util.List;

public class CategoryServiceImp implements CategoryService{
    CategotiesDao categotiesDao=new CategotiesDao();
    @Override
    public int intsert(Category category) throws SQLException, ClassNotFoundException {
        return categotiesDao.intsert(category);
    }

    @Override
    public int update(Category category, int id) throws SQLException, ClassNotFoundException {
        return categotiesDao.update(category);
    }

    @Override
    public int Delete(int id) throws SQLException, ClassNotFoundException {
        return categotiesDao.Delete(id);
    }

    @Override
    public List<Category> Selectall() throws SQLException, ClassNotFoundException {
        return categotiesDao.Selectall();
    }

    @Override
    public Category Select(int id) throws SQLException, ClassNotFoundException {
        return categotiesDao.Select(id);
    }
}
