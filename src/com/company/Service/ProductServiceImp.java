package com.company.Service;

import com.company.Dao.ProductDao;
import com.company.Model.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductServiceImp implements ProductService{
    ProductDao productDao=new ProductDao();
    @Override
    public int intsert(Product product) throws SQLException, ClassNotFoundException {
        return productDao.intsert(product);
    }

    @Override
    public int update(Product product, int id) throws SQLException, ClassNotFoundException {
        return productDao.update(product,id);
    }

    @Override
    public int Delete(int id) throws SQLException, ClassNotFoundException {
        return productDao.Delete(id);
    }

    @Override
    public List<Product> Selectall() throws SQLException, ClassNotFoundException {
        return productDao.Selectall();
    }

    @Override
    public Product Select(int id) throws SQLException, ClassNotFoundException {
        return productDao.Select(id);
    }
}
