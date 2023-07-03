package org.sample;

import java.util.Scanner;

public class Mainclass {
    EmployeeService service =new EmployeeService();
    static boolean ordering=true;
    public static  void menu() {
		System.out.println("*****************Welcome to Employee Management System***********************"+"\n 1.Add Employee" +"\n 2.View Employee"
                        +"\n 3.Update Employee" +"\n 4.Delete Employee" +"\n 5.view All Employee" +"\n 6.Exit");
		
	}
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	EmployeeService service = new EmployeeService();
    	
		do {
			menu();
			System.out.println("Enter your choice:");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Add Employee");
				service.addemp();
				break;
			case 2:
				System.out.println("View Employee");
				service.viewEmp();
				break;	
			case 3:
				System.out.println("Update Employee");
				service.updateEmp();
				break;
			case 4:
				System.out.println("Delete Employee");
				service.delEmp();
				break;
			case 5:
				System.out.println("View All Employee");
				service.viewAllEmps();
				break;
			case 6:
				System.out.println("Thank you for using Application!!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Please enter a valid choice");
				break;
			}
		} while (ordering);
	}
}
