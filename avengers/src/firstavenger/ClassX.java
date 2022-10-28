package firstavenger;

public class ClassX 
{
	final static int i; 
	final static int j=100;  //we can initialize while declaration
	void meth1() 
	{
		//i=50; //C.E. >> we can not initialize a final static variable in normal method
	}
	
	static void meth2()
	{
		//i=50; //C.E. >> we can not initialize a final static variable in normal method
	}
	
	static
	{
		i=50;  //we can initialize inside a static Block
		System.out.println("1st Static Block called: "+i);
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method called: "+i);
		// TODO Auto-generated method stub

	}
	
	static
	{
		//i=45; //C.E. Final variables are constant 
		System.out.println("2nd Static Block called: "+i);
	}

}
