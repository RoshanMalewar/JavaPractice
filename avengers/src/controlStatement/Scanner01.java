package controlStatement;

import java.util.Scanner;

public class Scanner01 {
	
	Scanner sc = new Scanner(System.in);
	
	void meth1()
	{
		
		System.out.println("Implement Scanner class");
		
		System.out.println("Please enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("User entered a value: "+a);
		
		System.out.println("Please enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println("User entered b value: "+b);
		
		int c = a+b;
		System.out.println("Addition: "+c);
		
		
	}
	String meth2()
	{
		System.out.println("--------Meth2() Execution----------");
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("User entered age: "+age);
			System.out.println("Please check availability to vote: ");
			return sc.next();
		}
		else
		{
			System.out.println("User entered age: "+age);
			System.out.println("Please check availability to vote: ");
			return sc.next();
		}
		
	}
		
		void meth3()
		{
			System.out.println("What is your name?");
			String Name = sc.nextLine();
			System.out.println("Name: "+Name);
		}
		
		void meth4(int a, int b)
		{
			
			for(System.out.println("--------------Meth4()--------------");a<=b;a++)
			{
				System.out.println("a Value: "+a);
			}
		}

	public static void main(String[] args) 
	{
		Scanner01 t1 = new Scanner01();
		//t1.meth1();
		//String result = t1.meth2();
		//System.out.println("You are "+result+" for vote");
		//t1.meth3();
		System.out.println("Please enter TWO numbers");
		t1.meth4(t1.sc.nextInt(),t1.sc.nextInt());

	}

}
