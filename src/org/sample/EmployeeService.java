package org.sample;
// child class
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class EmployeeService {
	HashSet<Employee> emp = new LinkedHashSet<Employee>();
	Employee emp1=new Employee(101,"Arun",20,"Developer","IT",20000);
	Employee emp2=new Employee(102,"Raj",25,"QA","IT",30000);
	Employee emp3=new Employee(103,"Mano",24,"BA","IT",40000);
	Employee emp4=new Employee(104,"Swetha",27,"Developer","IT",50000);
	Employee emp5=new Employee(105,"srinithi",26,"QA","IT",50000);
	Scanner s = new Scanner(System.in);
	boolean found =false;
	int Id;
	String Name;
	int Age;
	String Department;
	String Designation;
	double Salary;
	public EmployeeService() { // constructor
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		
		
	}
	// view all employees
		public void viewAllEmps() {
			for (Employee empe : emp) {
				System.out.println(empe);
			}
			

		}
		// view emp based on id
		public void viewEmp() {
			System.out.println("Enter Id: ");
			int id1 = s.nextInt();
			for (Employee empe1 : emp) {
				if (empe1.getId()==id1) {
					System.out.println(empe1);
					found = true;
					
				}
			}
			if (!found) {
				System.out.println("Employee with this id is not present");
			}
		}
		// update the employee
		public void updateEmp() {
				System.out.println("Enter id:");
				int id2 = s.nextInt();
				boolean found =false;
				for (Employee empe2 : emp) {
					if (empe2.getId()==id2) {
						System.out.println("Enter name:");
						String name = s.next();
						System.out.println("Enter new salary :");
						double sal = s.nextDouble();
						empe2.setName(name);
						empe2.setSalary(sal);
						System.out.println("Updated employees details are : ");
						System.out.println(empe2);
						found = true;
					}
				}
				if (!found) {
					System.out.println("Employee is not present");
				}
				else {
					System.out.println("Employee details are updated successfully!!");
				}

		}
		// delete employee
		public void delEmp() {
			 System.out.println("Enter id :");
                   int id3 = s.nextInt();
                   boolean found = false;
                   Employee empdel=null;
                   for (Employee empe3 : emp) {
					if (empe3.getId()==id3) {
						empdel=empe3;
						found=true;
					}
				}
                 if (!found) {
					System.out.println("Employee is not present");
				} 
                 else {
					emp.remove(empdel);
					System.out.println("Employee details deleted successfully!!");
				}
		}
		// add employee
		public void addemp() {
			System.out.println("Enter id :");
			int id4 = s.nextInt();
			System.out.println("Enter name : ");
			String name = s.next();
			System.out.println("Enter Age :");
			int age = s.nextInt();
			System.out.println("Enter Designation :");
			String des = s.next();
			System.out.println("Enter Department :");
			String dep = s.next();
			System.out.println("Enter salary :");
			double sal = s.nextDouble();
			Employee empA=new Employee(id4, name, age, des, dep, sal);
			emp.add(empA);
			System.out.println("Employee added successfully!!");

		}
		
}
