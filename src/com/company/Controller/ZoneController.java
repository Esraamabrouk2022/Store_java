package com.company.Controller;

import com.company.Model.Sizes;
import com.company.Model.Zones;
import com.company.Service.SizeerviceImp;
import com.company.Service.ZoneServiceImp;

import java.sql.SQLException;
import java.util.Scanner;

public class ZoneController {

    Scanner input = new Scanner(System.in);
    private ZoneServiceImp zoneServiceImp = new ZoneServiceImp();

    public void zoneconsole() throws SQLException, ClassNotFoundException {

        System.out.println("  Add new Zone Enter 1  ");
        System.out.println("  update Zone Enter 2  ");
        System.out.println("  Delete Zone Enter 3  ");
        System.out.println("  Select All Zones Enter 4 ");
        System.out.println("  Select Zones Enter 5  ");

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
        System.out.println("************ add new Zone ***************");
        Zones zones = new Zones();
        System.out.println(" Enter id : ");
        zones.setId(input.nextInt());
        if (zones.getId() == 0)
            return;
        System.out.println(" Enter city_id : ");
        zones.setCity_id(input.nextInt());
        System.out.println(" Enter Name : ");
        zones.setName(input.next());
        System.out.println(" Enter zones_col : ");
        zones.setZonescol(input.next());
        zoneServiceImp.intsert(zones);
    }

    public void update() throws SQLException, ClassNotFoundException {
        System.out.println("******************* Update zone ******************");

        Zones zones = new Zones();
        System.out.println(" Enter id : ");
        zones.setId(input.nextInt());
        if (zones.getId() == 0)
            return;
        System.out.println(" Enter city_id : ");
        zones.setCity_id(input.nextInt());
        System.out.println(" Enter Name : ");
        zones.setName(input.next());
        System.out.println(" Enter zones_col : ");
        zones.setZonescol(input.next());
        zoneServiceImp.update(zones,zones.getId());
    }

    public void delete() throws SQLException, ClassNotFoundException {
        System.out.println("************* Delete zone ***************");
        System.out.println("Enter id : ");
        zoneServiceImp.Delete(input.nextInt());
    }

    public void selcetall() throws SQLException, ClassNotFoundException {
        zoneServiceImp.Selectall();
    }

    public void select() throws SQLException, ClassNotFoundException {
        System.out.println("Enter id : ");
        zoneServiceImp.Select(input.nextInt());
    }
}

