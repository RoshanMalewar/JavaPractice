package controlStatement;

//WAP take a parameterized constructor with 2 int values and print gretest among them

public class ClassB {
	
	ClassB(int a, int b)
	{
		if(a>b)
		{
			System.out.println(a+ " Is the largest among two numbers");
		}
		else
		{
			System.out.println(b+ " Is the largest among two numbers");
		}
	}
	
	

	public static void main(String[] args) 
	{
		ClassB t1 = new ClassB(10, 20);
		

	}

}
