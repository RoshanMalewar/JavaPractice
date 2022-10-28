package controlStatement;

public class ForLoop_Pattern_3 
{
	void meth1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		ForLoop_Pattern_3 t1 = new ForLoop_Pattern_3();
		t1.meth1();

	}

}
