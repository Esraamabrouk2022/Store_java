package com.company.Service;

import com.company.Dao.BrandDao;
import com.company.Model.Brand;

import java.sql.SQLException;
import java.util.List;

public class BrandServiceImp implements BrandService {
    BrandDao brandDao=new BrandDao();
    @Override
    public int insert(Brand brand) {
        return brandDao.insert(brand);
    }

    @Override
    public int update(Brand brand, int id) throws SQLException, ClassNotFoundException {
        return brandDao.update(brand,id);
    }

    @Override
    public int Delete(int id) throws SQLException, ClassNotFoundException {
        return brandDao.Delete(id);
    }

    @Override
    public List<Brand> Selectall() throws SQLException, ClassNotFoundException {
        return brandDao.Selectall();
    }

    @Override
    public Brand Select(int id) throws SQLException, ClassNotFoundException {
        return brandDao.Select(id);
    }
}
