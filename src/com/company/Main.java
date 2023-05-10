package com.company;

import com.company.dp.entity.Brand;
import com.company.dp.entity.Category;
import com.company.rebo.BrandRebo;
import com.company.rebo.CategotiesRebo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
      /*  CategotiesRebo categotiesRebo=new CategotiesRebo();
        //Category category=new Category(11,"Category10 java","this category created");
        //categotiesRebo.intsert(category);
        List<Category> categoryList= categotiesRebo.Selectall();
        if(categoryList!=null){
            for(Category cat:categoryList){
                System.out.println("Id = "+cat.getId()+" name = "+cat.getName()+" descibtion = "+cat.getDescribtion());
            }
        }
*/
        Brand brand=new Brand(1,"chemis","s");
        BrandRebo brandRebo=new BrandRebo();
        brandRebo.update(brand,1);
       // brandRebo.update(brand,2);
    }
}
