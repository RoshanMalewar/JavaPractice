package exceptionHandling;

import java.util.Scanner;

public class exception_02 
{
	void meth1()
	{
		Scanner sc = new Scanner(System.in);
		String s = null;
		System.out.println(10);
		try
		{
			System.out.println("Try block executed");
			System.out.println("Please enter a number");
			System.out.println(">>>>>>> "+20/sc.nextInt());
			System.out.println("Length: "+s.length());
			System.out.println("Hello World");
		}
//		catch (ArithmeticException eobj)
//		{
//			System.out.println("1st Catch block executed");
//			eobj.printStackTrace();
//		}
//		catch (NullPointerException eobj)
//		{
//			System.out.println("2nd Catch block executed");
//			eobj.printStackTrace();
//		}
		
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println("Catch block executed");
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Finally Block executed");
		}
		System.out.println(30);
			
		}
	public static void main(String[] args) 
	{
		new exception_02().meth1();
		
	}
		
		


}
