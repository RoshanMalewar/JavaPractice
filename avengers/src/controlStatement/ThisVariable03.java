package controlStatement;

public class ThisVariable03 
{
	ThisVariable03 meth1()
	{
		System.out.println("Meth1() Called");
		return this; //Object Created >> We are returning the object of current class
	}
	
	ThisVariable03 meth2()
	{
		System.out.println("Meth2() Called");
		return this; //Object Created >> We are returning the object of current class
	}
	
	int meth3()
	{
		System.out.println("Meth3() Called");
		return 99;
	}


	public static void main(String[] args) 
	{
		int results = new ThisVariable03().meth1().meth2().meth3()+1;
		System.out.println(results);		

	}

}
