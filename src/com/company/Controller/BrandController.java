package com.company.Controller;

import com.company.Model.Branch;
import com.company.Model.Brand;
import com.company.Service.BranchServiceImp;
import com.company.Service.BrandServiceImp;

import java.sql.SQLException;
import java.util.Scanner;

public class BrandController {
    private Scanner input =new Scanner(System.in);
   private BrandServiceImp brandServiceImp=new BrandServiceImp();
    public void Brandconsole() throws SQLException, ClassNotFoundException {

        System.out.println("  Add new Brand Enter 1  ");
        System.out.println("  update Brand Enter 2  ");
        System.out.println("  Delete Brand Enter 3  ");
        System.out.println("  Select All Brand Enter 4 ");
        System.out.println("  Select Brand Enter 5  ");

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
        System.out.println("************ add new brand ***************");
        Brand brand=new Brand();
        System.out.println(" Enter id : ");
        brand.setId(input.nextInt());
        if (brand.getId() == 0)
            return;

        System.out.println(" Enter Name : ");
        brand.setName(input.next());
        System.out.println(" Enter Logo_path : ");
        brand.setLogo_path(input.next());
        brandServiceImp.insert(brand);

    }

    public void update() throws SQLException, ClassNotFoundException {
        System.out.println("******************* Update Branch ******************");
        Brand brand=new Brand();
        System.out.println(" Enter id : ");
        brand.setId(input.nextInt());
        if (brand.getId() == 0)
            return;

        System.out.println(" Enter Name : ");
        brand.setName(input.next());
        System.out.println(" Enter Logo_path : ");
        brand.setLogo_path(input.next());
        brandServiceImp.update(brand,brand.getId());
    }

    public void delete() throws SQLException, ClassNotFoundException {
        System.out.println("************* Delete Brand ***************");
        System.out.println("Enter id : ");
        brandServiceImp.Delete(input.nextInt());
    }

    public void selcetall() throws SQLException, ClassNotFoundException {
        brandServiceImp.Selectall();
    }

    public void select() throws SQLException, ClassNotFoundException {
        System.out.println("Enter id : ");
        brandServiceImp.Select(input.nextInt());
    }
}

