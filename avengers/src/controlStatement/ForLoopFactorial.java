package controlStatement;

public class ForLoopFactorial 
{
	void meth1(int num)
	{
		//factorial of 5 = 5*4*3*2*1 = 120 
		int factorial = 1;
		for(int i = 1;i<=num;i++)
		{
			factorial = factorial*i;
		}
		System.out.println("The Factorial of "+num+ " is: "+factorial);
	}

	public static void main(String[] args) 
	{
		ForLoopFactorial t1 = new ForLoopFactorial();
		t1.meth1(7);
	}

}
