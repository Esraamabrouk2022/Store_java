package com.company.Service;

import com.company.Dao.ProductSizeDao;
import com.company.Model.Product_size;

import java.sql.SQLException;
import java.util.List;


public class ProductSizeServiceImp implements ProductSizeService{
ProductSizeDao productSizeDao=new ProductSizeDao();
    @Override
    public int intsert(Product_size product_size) throws SQLException, ClassNotFoundException {
        return productSizeDao.intsert(product_size);
    }

    @Override
    public int update(Product_size product_size, int id) throws SQLException, ClassNotFoundException {
        return productSizeDao.update(product_size,id);
    }

    @Override
    public int Delete(int id) throws SQLException, ClassNotFoundException {
        return productSizeDao.Delete(id);
    }

    @Override
    public List<Product_size> Selectall() throws SQLException, ClassNotFoundException {
        return productSizeDao.Selectall();
    }

    @Override
    public Product_size Select(int id) throws SQLException, ClassNotFoundException {
        return productSizeDao.Select(id);
    }
}
