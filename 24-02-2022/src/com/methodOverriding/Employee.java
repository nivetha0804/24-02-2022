package com.methodOverriding;
//sub/derived/child class
public class Employee extends Organization
{

	//variables(state)
	double salary;
	static String deptName;

	//constructors
	public Employee() 
	{
		id = 1001;
		name = "VIJAY";
		salary = 50000.00;
	}

	//blocks
	static
	{
		deptName = "HARDWARE";
	}

	//methods(behavior)
	public void getInformation()//overrides com.polymorphism.Organization.getInformation()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
	}

	//main
	public static void main(String[] args) 
	{ 
		//objects
		Employee employee = new Employee();
		employee.getInformation();
				System.out.println("==============");
				
				Organization organization = new Organization();
		organization.getInformation();
		}
}
