package com.superMethod;

//sub/derived/child class
public class Employee extends Organization
{
	
	//variables(state)
	int id;
	String name;
	double salary;
	
	static String deptName;

	//constructors
	public Employee() 
	{
		super();//always sub class constructor will call super class constructor
		id = 3939;
		name = "Ajay";
		salary = 48474.45;
		System.out.println("Employee class constructor");
	}

	//blocks
	static
	{
		deptName = "Development";
	}
	
	//methods(behavior)
	public void getEmployeeInformation()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
		System.out.println(super.id);
		System.out.println(super.name);
	}
	
	//main
	public static void main(String[] args) 
	{ 
		//object creation statement
		Employee employee = new Employee();
				
	}	
	

}
