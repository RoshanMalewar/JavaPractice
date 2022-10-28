package controlStatement;

public class ClassA 
{
	void Meth1(int a, int b, int c)
	{
		if(a>b)
		{
			System.out.println("A is Largest number");
		}
		
		else if (b>c)
		{
			System.out.println("B is largest number");
		}
		else
		{
			System.out.println("C is largest number");
		}
	}

	public static void main(String[] args) 
	{
		ClassA t1 = new ClassA();
		t1.Meth1(40, 40, 40);
	

	}

}
