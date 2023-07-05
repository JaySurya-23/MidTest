package com.oops;

interface FirstQInterface {
	
	void show();
	
	default void demo(int id)
	{
		System.out.println("In Demo");
	}
	
	static void demo1()
	{
		System.out.println("In  Interface ");
	}

	void display();
}

class One implements FirstQInterface
{
	public void show()
	{
		System.out.println("Inside One Show");
	}
	
	public void display()
	{
		System.out.println("Inside One display");
	}
}

class Second implements FirstQInterface
{
	public void show()
	{
		System.out.println("Inside Second Show");
	}
	
	public void display()
	{
		System.out.println("Inside Second display");
	}
}

class Third implements FirstQInterface
{
	public void show()
	{
		System.out.println("Inside Third Show");
	}
	
	public void display()
	{
		System.out.println("Inside Third display");
	}
}

public class Question_1 implements FirstQInterface
{
	public static void main(String[] args) 
	{
		One o = new One();
		o.show();
		o.display();
		
		Second s = new Second();
		s.display();
		s.show();
		
		Third t = new Third();
		t.display();
		t.show();
		
		FirstQInterface.demo1();
		
		Question_1 fq = new Question_1();
		fq.display();
		fq.show();
	}

	@Override
	public void show() 
	{
		System.out.println("Inside FirstQuestion show");
	}

	@Override
	public void display() 
	{
		System.out.println("Inside FirstQuestion world");
	}

}
