package org.sample;
// parent class
public class Employee {
	private int Id;
	private String Name;
	private int Age;
	private String Designation;
	private String Department;
	private double Salary;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		this.Designation = designation;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		this.Department = department;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		this.Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", Designation=" + Designation
				+ ", Department=" + Department + ", Salary=" + Salary + "]";
	}
public Employee(int Id, String Name, int Age, String Designation, String Department, double Salary) {
		super();
		this.Id=Id;
		this.Name=Name;
		this.Age=Age;
		this.Designation=Designation;
		this.Department=Department;
		this.Salary=Salary;
		
				
		
	}

}
