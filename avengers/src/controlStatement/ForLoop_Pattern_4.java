package controlStatement;

public class ForLoop_Pattern_4 
{
	void display(int n)
	{
		int i,j;
		for(i=0; i<n; i++)
		{
			for(j=2*(n-1);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(j=0; j<=i;j++)
			{
				System.out.println("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		ForLoop_Pattern_4 t1 = new ForLoop_Pattern_4();
		t1.display(5);
		// TODO Auto-generated method stub

	}

}
