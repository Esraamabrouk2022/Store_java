package com.company.Controller;

import com.company.Model.Category;
import com.company.Model.City;
import com.company.Service.CityServiceImp;

import java.sql.SQLException;
import java.util.Scanner;

public class CityController {
    Scanner input=new Scanner(System.in);
    CityServiceImp cityServiceImp=new CityServiceImp();
    public void cityconsole() throws SQLException, ClassNotFoundException {

        System.out.println("  Add new City Enter 1  ");
        System.out.println("  update City Enter 2  ");
        System.out.println("  Delete City Enter 3  ");
        System.out.println("  Select All City Enter 4 ");
        System.out.println("  Select City Enter 5  ");

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
        System.out.println("************ add new City ***************");
        City city=new City();
        System.out.println(" Enter id : ");
        city.setId(input.nextInt());
        if (city.getId() == 0)
            return;

        System.out.println(" Enter Name : ");
        city.setName(input.next());
        cityServiceImp.intsert(city);

    }

    public void update() throws SQLException, ClassNotFoundException {
        System.out.println("******************* Update city ******************");
        City city=new City();
        System.out.println(" Enter id : ");
        city.setId(input.nextInt());
        if (city.getId() == 0)
            return;

        System.out.println(" Enter Name : ");
        city.setName(input.next());
        cityServiceImp.update(city,city.getId());
    }

    public void delete() throws SQLException, ClassNotFoundException {
        System.out.println("************* Delete city ***************");
        System.out.println("Enter id : ");
        cityServiceImp.Delete(input.nextInt());
    }

    public void selcetall() throws SQLException, ClassNotFoundException {
        cityServiceImp.Selectall();
    }

    public void select() throws SQLException, ClassNotFoundException {
        System.out.println("Enter id : ");
       cityServiceImp.Select(input.nextInt());
    }
}
