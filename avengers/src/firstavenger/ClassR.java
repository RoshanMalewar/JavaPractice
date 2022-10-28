package firstavenger;

public class ClassR 
{
	void meth1(int a)
	{
		if(a>=50)
		{
			System.out.println("If Block executed");
		}
		else
		{
			System.out.println("Else Block executed");
		}
		new ClassR().meth2(19);
	}
	
	void meth2(int a)
	{
		if(a>=18)
		{
			System.out.println("The candidate is eligible for voting");
		}
		else
		{
			System.out.println("Candidate is not eligible");
		}
	}

	public static void main(String[] args) 
	{
		ClassR t1 = new ClassR();
		t1.meth1(40);
		t1.meth2(20);
		
		// TODO Auto-generated method stub

	}

}
