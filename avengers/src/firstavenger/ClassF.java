package firstavenger;

public class ClassF {
	
	ClassF()    //1st Constructor
	{
		new ClassF(100).meth2();
		System.out.println("I'm from non-parameterized constructor");
	}
	ClassF(int a)  //2nd Constructor --> Parameterized constructor having 1 parameter
	{
		System.out.println("Parameterized constructor: "+a);
		new ClassF(99,1).meth3();
	}
	ClassF(int a,int b)    //3rd Constructor --> Parameterized constructor having 2 parameters
	{
		System.out.println("Addition: "+(a+b));
	}
	void meth1()   //Java Method
	{
		System.out.println("Meth1 called");
	}
	void meth2()    //Java Method
	{
		System.out.println("Meth2 Called");
	}
	void meth3()    //Java Method
	{
		System.out.println("Meth3 Called");
	}

	public static void main(String[] args) 
	{
		System.out.println("Start");
		ClassF aobj = new ClassF();
		aobj.meth1();
		System.out.println("End");
		
	}

}
