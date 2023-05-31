package com.company.Controller;

import com.company.Model.Brand;
import com.company.Model.Category;
import com.company.Service.CategoryServiceImp;

import java.sql.SQLException;
import java.util.Scanner;

public class CategoryController {
    Scanner input=new Scanner(System.in);
    CategoryServiceImp categoryServiceImp=new CategoryServiceImp();

    public void Categoryconsole() throws SQLException, ClassNotFoundException {

        System.out.println("  Add new Category Enter 1  ");
        System.out.println("  update Category Enter 2  ");
        System.out.println("  Delete Category Enter 3  ");
        System.out.println("  Select All Categories Enter 4 ");
        System.out.println("  Select Category Enter 5  ");

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
        System.out.println("************ add new Category ***************");
        Category category=new Category();
        System.out.println(" Enter id : ");
        category.setId(input.nextInt());
        if (category.getId() == 0)
            return;

        System.out.println(" Enter Name : ");
        category.setName(input.next());
        System.out.println(" Enter Logo_path : ");
        category.setDescribtion(input.next());
        categoryServiceImp.intsert(category);

    }

    public void update() throws SQLException, ClassNotFoundException {
        System.out.println("******************* Update Category ******************");
        Category category=new Category();
        System.out.println(" Enter id : ");
        category.setId(input.nextInt());
        if (category.getId() == 0)
            return;

        System.out.println(" Enter Name : ");
        category.setName(input.next());
        System.out.println(" Enter Describtion : ");
        category.setDescribtion(input.next());
       categoryServiceImp.update(category,category.getId());
    }

    public void delete() throws SQLException, ClassNotFoundException {
        System.out.println("************* Delete Category ***************");
        System.out.println("Enter id : ");
        categoryServiceImp.Delete(input.nextInt());
    }

    public void selcetall() throws SQLException, ClassNotFoundException {
        categoryServiceImp.Selectall();
    }

    public void select() throws SQLException, ClassNotFoundException {
        System.out.println("Enter id : ");
       categoryServiceImp.Select(input.nextInt());
    }
}

