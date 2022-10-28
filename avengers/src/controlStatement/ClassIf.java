package controlStatement;

public class ClassIf 
{
	void meth1(int a)
	{
		System.out.println("-------------Meth1()------------");
		if(a<=5)
		{
			System.out.println("If Block Executed");
			System.out.println("Hi: "+a);
		}
		System.out.println("meth1() execution completed");
		
	}
	
	void meth2(int a)
	{
		System.out.println("-------------Meth2()------------");
		if(a>=5)
		//int x=100; //C.E >>  
		/* If we are not writing {} in if condition, only one statement is dependent on the If condition
		 * and in that one statement we should not write any declarative statement		
		 */
			System.out.println("Hi");
			System.out.println("Hello");
			System.out.println("meth2() execution completed");
		
	}
	
	void meth3(int a)
	{
		System.out.println("-------------Meth3()------------");
		if(a>=5)
		{
			int x=100;
			System.out.println("Hi");
		}
			
			System.out.println("Hello");
			System.out.println("meth3() execution completed");
		
	}
	
	void meth4(int a)
	{
		System.out.println("-------------Meth4()------------");
		if(false)
		{
			System.out.println("If Block Executed"); // Dead code >> for the condition FALSE tis block will never execute
			System.out.println("Hi: "+a);
		}
		System.out.println("meth1() execution completed");
		
	}
	
	void meth5(int a)
	{
		System.out.println("-------------Meth5()------------");
		if(true)
		{
			System.out.println("If Block Executed");
			System.out.println("Hi: "+a);
		}
		System.out.println("meth5() execution completed");
		
	}
	
	void meth6(int a)
	{
		System.out.println("-------------Meth6()------------");
		if(a<=10)
		{
			System.out.println("If Block Executed");
			System.out.println("Hi");
		}
		else
		{
			System.out.println("Else Block Executed");
			System.out.println("Hi");
		}
		System.out.println("meth6() execution completed");
		
	}
	
	void meth7(int a)
	{
		System.out.println("-------------Meth6()------------");
		if(a<=10)
			System.out.println("If Block Executed");
		else
			System.out.println("Else Block Executed");
			System.out.println("Hi");
		
		System.out.println("meth7() execution completed");
		
	}
	
	void meth8(int a)
	{
		System.out.println("-------------Meth6()------------");
		if(a>0)
		{
			System.out.println(a+" is a positive number");
		}
			
		else if(a<0)
		{
			System.out.println(a+" is a negative number");
		}
		
		else 
		{
			System.out.println(a+" is equal to 0");
		}
					
		System.out.println("meth8() execution completed");
		
	}


	public static void main(String[] args) 
	{
		ClassIf t1 = new ClassIf();
		//t1.meth1(20);
		//t1.meth2(10);
		//t1.meth3(100);
		//t1.meth4(50);
		//t1.meth5(10);
		//t1.meth6(25);
		//t1.meth7(10);
		t1.meth8(0);
		

	}

}
