package oopsConcepts;

public class ClassIH_B extends ClassIH_A
{
	void meth2()
	{
		System.out.println("ClassB meth2() called");
		super.meth1();  //By the use of super keyword we can call parent class methods
	}
	void display()
	{
		System.out.println("Hello");
	}
	
	ClassIH_B()
	{
		System.out.println("Class B Default Constructor");		
	}
	
	ClassIH_B(String s)
	{
		//this();  //we can not use this() and super() in same constructor as both should be 1st statement 
		super("Hello World"); //super() constructor call us used to call parent class constructor
		super.show();
		this.display();
		System.out.println("Class B Parameterized constructor: "+s);
	}
	
	public static void main(String[] args) 
	{
		ClassIH_B bobj = new ClassIH_B("Java is Awesome");
		bobj.meth2();
	}

}
