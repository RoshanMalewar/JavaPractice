package firstavenger;

public class ClassY 
{
	static int a = meth1();
	static int b= meth2();
	
	static int meth1()
	{
		System.out.println("Static Meth1 called");
		return 100;
	}
	static int meth2()
	{
		System.out.println("Static Meth2 called");
		return 200;
	}
	
	static
	{
		System.out.println("1st static block executed: "+a);
	}
	

	public static void main(String[] args) 
	{
		//ClassY t1 = new ClassY();
		System.out.println("Main method called: "+(a+b));
		// TODO Auto-generated method stub

	}
	static
	{
		System.out.println("2nd static block executed: "+b);
	}

}
