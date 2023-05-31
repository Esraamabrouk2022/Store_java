package com.company.Controller;

import com.company.Model.City;
import com.company.Model.Sizes;
import com.company.Service.CityServiceImp;
import com.company.Service.SizeerviceImp;

import java.sql.SQLException;
import java.util.Scanner;

public class SizeController {
    Scanner input = new Scanner(System.in);
    private SizeerviceImp sizeerviceImp = new SizeerviceImp();

    public void Sizeconsole() throws SQLException, ClassNotFoundException {

        System.out.println("  Add new Size Enter 1  ");
        System.out.println("  update Size Enter 2  ");
        System.out.println("  Delete Size Enter 3  ");
        System.out.println("  Select All size Enter 4 ");
        System.out.println("  Select size Enter 5  ");

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
        System.out.println("************ add new size ***************");
        Sizes sizes = new Sizes();
        System.out.println(" Enter id : ");
        sizes.setId(input.nextInt());
        if (sizes.getId() == 0)
            return;

        System.out.println(" Enter Name : ");
        sizes.setName(input.next());
        sizeerviceImp.intsert(sizes);

    }

    public void update() throws SQLException, ClassNotFoundException {
        System.out.println("******************* Update sizes ******************");
        Sizes sizes = new Sizes();
        System.out.println(" Enter id : ");
        sizes.setId(input.nextInt());
        if (sizes.getId() == 0)
            return;

        System.out.println(" Enter Name : ");
        sizes.setName(input.next());
        sizeerviceImp.update(sizes, sizes.getId());
    }

    public void delete() throws SQLException, ClassNotFoundException {
        System.out.println("************* Delete size ***************");
        System.out.println("Enter id : ");
        sizeerviceImp.Delete(input.nextInt());
    }

    public void selcetall() throws SQLException, ClassNotFoundException {
        sizeerviceImp.Selectall();
    }

    public void select() throws SQLException, ClassNotFoundException {
        System.out.println("Enter id : ");
        sizeerviceImp.Select(input.nextInt());
    }
}
