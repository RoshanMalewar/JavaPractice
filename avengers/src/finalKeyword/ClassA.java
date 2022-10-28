package finalKeyword;

public class ClassA 
{
	final int a = 10;
	
	final void meth1()
	{
		System.out.println("Meth1() called");
	}
	
	public static void main(String[] args) 
	{
		new ClassA().meth1();
		
		//what is the difference between final finally and finalize
	}

}
