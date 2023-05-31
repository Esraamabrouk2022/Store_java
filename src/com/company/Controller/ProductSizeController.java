package com.company.Controller;

import com.company.Model.Product;
import com.company.Model.Product_size;
import com.company.Service.ProductSizeServiceImp;

import java.sql.SQLException;
import java.util.Scanner;

public class ProductSizeController {
    Scanner input=new Scanner(System.in);
    private ProductSizeServiceImp productSizeServiceImp=new ProductSizeServiceImp();

    public void ProductSizeconsole() throws SQLException, ClassNotFoundException {

        System.out.println("  Add new product_Size Enter 1  ");
        System.out.println("  update product_size Enter 2  ");
        System.out.println("  Delete product_Size Enter 3  ");
        System.out.println("  Select All products_Size Enter 4 ");
        System.out.println("  Select product_size Enter 5  ");

        switch (input.nextInt()) {
            case 1:
                this.insert();
                break;
            case 2:
                this.update();
                break;
            case 3:
                this.delete();
                break;
            case 4:
                this.selcetall();
                break;
            case 5:
                this.select();
                break;
        }
    }
    public void insert() throws SQLException, ClassNotFoundException {
        System.out.println("************ add new product_size ***************");
        Product_size product_size=new Product_size();
        System.out.println(" Enter id : ");
        product_size.setId(input.nextInt());
        if (product_size.getId() == 0)
            return;
        System.out.println(" Enter product_id : ");
        product_size.setProducts_id(input.nextInt());
        System.out.println(" Enter sizes_id : ");
        product_size.setSizes_id(input.nextInt());
        System.out.println(" Enter sizes : ");
        product_size.setSize(input.nextInt());
        System.out.println(" Enter Price : ");
        product_size.setPrice(input.nextFloat());
        productSizeServiceImp.intsert(product_size);
    }

    public void update() throws SQLException, ClassNotFoundException {
        System.out.println("******************* Update product_size ******************");
        Product_size product_size=new Product_size();
        System.out.println(" Enter id : ");
        product_size.setId(input.nextInt());
        if (product_size.getId() == 0)
            return;
        System.out.println(" Enter product_id : ");
        product_size.setProducts_id(input.nextInt());
        System.out.println(" Enter sizes_id : ");
        product_size.setSizes_id(input.nextInt());
        System.out.println(" Enter sizes : ");
        product_size.setSize(input.nextInt());
        System.out.println(" Enter Price : ");
        product_size.setPrice(input.nextFloat());
        productSizeServiceImp.update(product_size,product_size.getId());
    }

    public void delete() throws SQLException, ClassNotFoundException {
        System.out.println("************* Delete product_size ***************");
        System.out.println("Enter id : ");
        productSizeServiceImp.Delete(input.nextInt());
    }

    public void selcetall() throws SQLException, ClassNotFoundException {
        productSizeServiceImp.Selectall();
    }

    public void select() throws SQLException, ClassNotFoundException {
        System.out.println("Enter id : ");
        productSizeServiceImp.Select(input.nextInt());
    }



}

