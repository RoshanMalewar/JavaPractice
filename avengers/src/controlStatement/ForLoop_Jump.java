package controlStatement;

public class ForLoop_Jump 
{
	void meth1()
	{
		System.out.println("Implementing Jump Statements");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				//break;
				//continue;
				return;
			}
			System.out.println("i Value : "+i);
		}
		System.out.println("compiler came out from FOR LOOP");
	}

	public static void main(String[] args) 
	{
		System.out.println("Start");
		ForLoop_Jump t1 = new ForLoop_Jump();
		t1.meth1();
		//break; //C.E >> we can use break only in "Switch" and "Loop"
		//continue; //C.E >> we can use continue only in "Loop"
		System.out.println("End");

	}

}
