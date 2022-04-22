package com.methodOverloading;

//method overloading: method name is same but change in parameters

public class Employee 
{
	//variables(state)
	int id;
	String name;
	double salary;
	static String deptName;

	//default constructor
	public Employee() 
	{
		id = 5001;
		name = "Sneha";
		salary = 40000.00;
	}

	//blocks
	static
	{
		deptName = "Development";
	}

	//methods without parameters
	public void getInformation()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
	}

	//method with parameters
	public void getInformation(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
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
		System.out.println("=================");
		employee.getInformation(5002, "Sakthi", 40000.00);
		System.out.println("=================");
		employee.getInformation(5003, "Shreya", 40000.00);
		System.out.println("=================");
		employee.getInformation(5004, "Swetha", 40000.00);
		System.out.println("=================");
		employee.getInformation(5005, "Suruthi", 40000.00);
			}	
}
