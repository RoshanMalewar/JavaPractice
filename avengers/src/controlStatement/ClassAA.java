package controlStatement;

public class ClassAA 
{
	void meth1(int a, int b, int c)
	{
		
		if(a>b)
		{
			System.out.println("Hi");
			if(a>c)
			System.out.println(a+ " is the biggest number among three");
			
			else
				System.out.println(c+" is the biggest number among three");
		}
		else
		{
			System.out.println("Hello");
			if(b>c)
				System.out.println(b+ " is the biggest number among three");
			else
				System.out.println(c+ " is the biggest number among three");
		}
	}

	public static void main(String[] args) {
		ClassA t1 = new ClassA();
		t1.Meth1(40, 500, 100);

	}

}
