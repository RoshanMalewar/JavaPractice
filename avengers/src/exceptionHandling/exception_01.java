package exceptionHandling;

import java.util.Scanner;

public class exception_01 {
	
	void meth1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(10);
		try
		{
			System.out.println("Try block executed");
			System.out.println("Please enter a number");
			System.out.println(">>>>>>> "+20/sc.nextInt());
		}
		catch(Exception e) // Exception is a parent class of all the exceptions 
		{
			System.out.println("Catch block executed");
			//System.out.println(e.getMessage()); //This method display reason of the exception
			//System.out.println(e.toString()); //This method will display Name and reason of the exception
			e.printStackTrace(); // This method gives the complete information about the exception
		}
		
		finally
		{
			System.out.println("Finally block executed");
		}
		
		System.out.println(30);
	}

	public static void main(String[] args) 
	{
		new exception_01().meth1();

	}

}
