package com.company.Controller;

import com.company.Model.Category;
import com.company.Model.Product;
import com.company.Service.ProductServiceImp;

import java.sql.SQLException;
import java.util.Scanner;

public class ProductController {
    private Scanner input=new Scanner(System.in);
    private ProductServiceImp productServiceImp=new ProductServiceImp();

    public void Productconsole() throws SQLException, ClassNotFoundException {

        System.out.println("  Add new product Enter 1  ");
        System.out.println("  update product Enter 2  ");
        System.out.println("  Delete product Enter 3  ");
        System.out.println("  Select All products Enter 4 ");
        System.out.println("  Select product Enter 5  ");

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
        System.out.println("************ add new product ***************");
        Product product=new Product();
        System.out.println(" Enter id : ");
        product.setId(input.nextInt());
        if (product.getId() == 0)
            return;
        System.out.println(" Enter Category_id : ");
        product.setCategorey_id(input.nextInt());
        System.out.println(" Enter Name : ");
        product.setName(input.next());
        System.out.println(" Enter Description : ");
        product.setDescriotion(input.next());
        System.out.println(" Enter Picture_path : ");
        product.setPicture_path(input.next());
        productServiceImp.intsert(product);
    }

    public void update() throws SQLException, ClassNotFoundException {
        System.out.println("******************* Update  product ******************");
        Product product=new Product();
        System.out.println(" Enter id : ");
        product.setId(input.nextInt());
        if (product.getId() == 0)
            return;
        System.out.println(" Enter Category_id : ");
        product.setCategorey_id(input.nextInt());
        System.out.println(" Enter Name : ");
        product.setName(input.next());
        System.out.println(" Enter Description : ");
        product.setDescriotion(input.next());
        System.out.println(" Enter Picture_path : ");
        product.setPicture_path(input.next());
        productServiceImp.update(product,product.getId());
    }

    public void delete() throws SQLException, ClassNotFoundException {
        System.out.println("************* Delete product ***************");
        System.out.println("Enter id : ");
        productServiceImp.Delete(input.nextInt());
    }

    public void selcetall() throws SQLException, ClassNotFoundException {
        productServiceImp.Selectall();
    }

    public void select() throws SQLException, ClassNotFoundException {
        System.out.println("Enter id : ");
       productServiceImp.Select(input.nextInt());
    }



}
