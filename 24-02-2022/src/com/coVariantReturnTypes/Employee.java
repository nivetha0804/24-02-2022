package com.coVariantReturnTypes;

//sub/derived/child class

public class Employee extends Organization
{
		//variables(state)
	double salary;
		static String deptName;

	//constructors
	public Employee() 
	{
		id = 1000;
		name = "Sneha";
		salary = 40000.00;
	}

	//blocks
	static
	{
		deptName = "SOFTWARE";
	}
	
	//methods(behavior)
	//public int getInformation()//method return type is void
	public Employee getInformation()
	{
				//The return type is incompatible with Organization.getInformation()
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
				return null;
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

