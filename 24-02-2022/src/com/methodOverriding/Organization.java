package com.methodOverriding;

//super/base/parent class
public class Organization
{
	int id;
	String name;

	public Organization() 
	{	
		id = 1002;
		name = "HCL";
	}

	public void getInformation()//method
	{
		System.out.println(id);
		System.out.println(name);
	}
}
