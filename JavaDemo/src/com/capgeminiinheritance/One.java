package com.capgeminiinheritance;

public class One {
	void disp1()
	{
		System.out.println("One");
	}
}
class Two extends One
{
	void disp2()
	{
		System.out.println("Two");
	}
}
class Three extends One
{
	void disp3()
	{
		System.out.println("Three");
	}
}
class Four extends One
{
	void disp3()
	{
		System.out.println("Four");
	}
}
public class A{
public static void main(String[] args)
{
	Four obj1 = new Four();
	obj1.disp1();
	obj1.disp4();
	
	Three obj2 = new Three();
	obj1.disp1();
	obj1.disp3();
	
	Two obj3 = new Two();
	obj1.disp1();
	obj1.disp2();
	
}

}

