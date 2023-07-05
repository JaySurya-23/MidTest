package com.oops;

class Person5
{
	long addharNo;
	String name;
	int age;
	long mobile;
	
	Person5()
	{
		addharNo = 200592517790l;
		name = "Jay";
		age = 24;
		mobile = 9689909228l;
		
		System.out.println(this.addharNo+" "+this.name+" "+this.age+" "+this.mobile);
	}

}

class Employee5 extends Person5
{
	Employee5()
	{
		super();
	}
	
	public Employee5(String name)
	{
		System.out.println("Employee Name is Yash");
	}
	
	public void name()
	{
		System.out.println("Total Employees Are 50");
	}
}

class Manager extends Employee5
{
	public Manager(String s)
	{
		super(s);
	}
	
	public void sun()
	{
		super.name();
	}
	
	public void gun()
	{
		System.out.println("Inside Manager method");
	}
}

public class Question_5 {

	public static void main(String[] args) {

		Manager m = new Manager("Jay");
		
		m.sun();
		m.gun();

	}

}
