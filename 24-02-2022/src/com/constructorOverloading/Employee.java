package com.constructorOverloading;

public class Employee 
{
	//variables(state)
	int id;
	String name;
	double salary;
	static String deptName;

	//default constructor(without parameters)
	public Employee() 
	{
		id = 1001;
		name = "Monika";
		salary = 25000.00;
	}

	//parameterized constructor(with parameters)
	public Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	//main
	public static void main(String[] args) 
	{ 
		//objects
		Employee employee = new Employee();
		employee.getInformation();
		System.out.println("=================");
		Employee employee1 = new Employee(1002, "Sathya", 25000.00);
		employee1.getInformation();
		System.out.println("=================");
		Employee employee2 = new Employee(1003, "Akshaya", 25000.00);
		employee2.getInformation();
		System.out.println("=================");
		Employee employee3 = new Employee(1004, "Soubi", 25000.00);
		employee3.getInformation();
		System.out.println("=================");
		Employee employee4 = new Employee(1005, "Bhava", 25000.00);
		employee4.getInformation();
	}	
}
