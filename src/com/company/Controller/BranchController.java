package com.company.Controller;

import com.company.Model.Branch;
import com.company.Service.BranchServiceImp;

import java.sql.SQLException;
import java.util.Scanner;

public class BranchController {
    private Scanner input = new Scanner(System.in);
    private BranchServiceImp branchServiceImp = new BranchServiceImp();

    public void BranchConsole() throws SQLException, ClassNotFoundException {
        System.out.println("  Add new Branch Enter 1  ");
        System.out.println("  update Branch Enter 2  ");
        System.out.println("  Delete Branch Enter 3  ");
        System.out.println("  Select All Branches Enter 4 ");
        System.out.println("  Select Branch Enter 5  ");

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
        System.out.println("************add new branch***************");
        Branch branch = new Branch();
        System.out.println(" Enter id : ");
        branch.setId(input.nextInt());
        if (branch.getId() == 0)
            return;
        System.out.println(" Enter zone_id : ");
        branch.setZone_id(input.nextInt());
        System.out.println(" Enter Name : ");
        branch.setName(input.next());
        System.out.println(" Enter Building Name : ");
        branch.setBuilding_name(input.next());
        System.out.println(" Enter Street Name : ");
        branch.setStreet_name(input.next());
        System.out.println(" Enter Working_start : ");
        branch.setWorking_start(input.nextLine());
        System.out.println(" Enter Working_end : ");
        branch.setWorking_end(input.nextLine());
        System.out.println(" Enter Telephone :  ");
        branch.setTelephonel(input.next());
        branchServiceImp.intsert(branch);
    }

    public void update() throws SQLException, ClassNotFoundException {
        System.out.println("******************* Update Branch ******************");
        System.out.println(" Enter id : ");
        Branch branch = new Branch();
        branch.setId(input.nextInt());
        if (branch.getId() == 0)
            return;
        System.out.println(" Enter zone_id : ");
        branch.setZone_id(input.nextInt());
        System.out.println(" Enter Name : ");
        branch.setName(input.next());
        System.out.println(" Enter Building Name : ");
        branch.setBuilding_name(input.next());
        System.out.println(" Enter Street Name : ");
        branch.setStreet_name(input.next());
        System.out.println(" Enter Working_start : ");
        branch.setWorking_start(input.nextLine());
        System.out.println(" Enter Working_end : ");
        branch.setWorking_end(input.nextLine());
        System.out.println(" Enter Telephone :  ");
        branch.setTelephonel(input.next());
        branchServiceImp.update(branch, branch.getId());
    }

    public void delete() throws SQLException, ClassNotFoundException {
        System.out.println("************* Delete Branch ***************");
        System.out.println("Enter id : ");
        branchServiceImp.Delete(input.nextInt());
    }

    public void selcetall() throws SQLException, ClassNotFoundException {
        branchServiceImp.Selectall();
    }

    public void select() throws SQLException, ClassNotFoundException {
        System.out.println("Enter id : ");
        branchServiceImp.Select(input.nextInt());
    }
}
