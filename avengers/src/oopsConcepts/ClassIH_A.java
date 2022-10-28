package oopsConcepts;

public class ClassIH_A 
{
	void meth1()
	{
		System.out.println("ClassA meth1() called");
	}
	void show()
	{
		System.out.println("Hi");
	}
	ClassIH_A()
	{
		System.out.println("Class A default constructor");
	}
	ClassIH_A(String s)
	{
		System.out.println("Class A parameterized constructor: "+s);
	}

}
