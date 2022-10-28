package controlStatement;

public class ForLoop_01 
{
	void meth1()
	{
		System.out.println("----------------Meth1()--------------");
		for(int i=1; i<=3;i++)
		{
			System.out.println("i value :"+i);
		}
		System.out.println("Meth1() execution is completed");
	}
	
	void meth2()
	{
		System.out.println("----------------Meth2()--------------");
		for(int i=1; i<=10;i++)
		{
			System.out.println("i value :"+i);
			i++;
		}
		System.out.println("Meth2() execution is completed");
	}
	
	void meth3()
	{
		System.out.println("----------------Meth3()--------------");
		int i = 1;
		for(; i<=3;)
		{
			System.out.println("i value :"+i);
			i++;
		}
		System.out.println("Meth3() execution is completed");
	}
	
	void meth4() //This method will generate infinite loop, as we are not using {} braces in For Loop.
	{
		System.out.println("----------------Meth4()--------------");
		int i = 1;
		for(; i<=3;)
			//int x =10; //C.E >> because we should not declare any variable here
		System.out.println("i value :"+i);
		System.out.println("Meth4() execution is completed");
	}
	
	void meth5()
	{
		int i = meth7();
		for(System.out.println("-----------Meth5()-----------");i<=5;meth6())
		{
			System.out.println("i value :"+i);
			i++;
		}
		System.out.println("Meth5() execution is completed");
	}
	
	static void meth6()
	{
		System.out.println("******************");
	}
	static int meth7()
	{
		System.out.println("Java is awesome");
		return 100-99;
	}
	 
	void meth8() //generates an infinite loop 
	{
		int i = 1;
		for(;;)
		{
			System.out.println("i value :"+i);
			i++;
		}
		//System.out.println("Meth5() execution is completed"); //C.E >> because the code is unreachable as there is no condition added in for loop. 
	}
	
	void meth9()
	{
		System.out.println("-------------Meth9()-----------");
		int i = 1;
		for(System.out.print("Java"),System.out.println(" is awesome");i<=3;System.out.println("Hi"), System.out.println("--------------"))
		{
			System.out.println("i value :"+i);
			i++;
		}
		System.out.println("Meth9() execution is completed");
	}





	public static void main(String[] args) 
	{
		ForLoop_01 t1 = new ForLoop_01();
		//t1.meth1();
		//t1.meth2();
		//t1.meth3();
		//t1.meth4();
		//t1.meth5();
		//t1.meth8();
		t1.meth9();
	}

}
