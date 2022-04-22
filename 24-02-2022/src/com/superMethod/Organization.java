package com.superMethod;

//super/base/parent class
public class Organization
{
	int id;
	String name;
	
	public Organization() 
	{	
		id = 5050;
		name = "Infosys";
		System.out.println("Organization class constructor");
	}
	
	public void getOrganizationInformation()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
}
