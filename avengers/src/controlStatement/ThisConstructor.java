package controlStatement;

public class ThisConstructor
{
	void meth1()
	{
		//this(); //C.E >> Because we need to use "this()" inside a constructor only
		System.out.println("Meth1() Called");
		//new ThisConstructor();
		
	}
	ThisConstructor()
	{
		this("Java Is Awesome");
		System.out.println("Default Constructor Called");
	}
	ThisConstructor(int a)
	{
		this();
		System.out.println("Parameterized Constructor: "+a);
		//new ThisConstructor();
		//this(); // C.E >> this() constructor call should be 1st statement
	}
	
	ThisConstructor(String s)
	{
		System.out.println(s);
		this.meth2();
	}
	void meth2()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) 
	{
		new ThisConstructor(500).meth1();
	

	}

}
