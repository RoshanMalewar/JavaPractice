package controlStatement;

public class ForLoop_Pattern_2 
{
	void meth1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) 
	{
		ForLoop_Pattern_2 t1 = new ForLoop_Pattern_2();
		t1.meth1();
	

	}

}
