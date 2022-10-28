package java8features;

import java.util.Arrays;
import java.util.Scanner;

public class ClassB 
{
	void m1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of an array");
		int arr[] =new int[sc.nextInt()];
		System.out.println("Please Enter "+arr.length+ " int data");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	
	static void m2()
	{
		System.out.println("This is static method referencing");
	}
	
	ClassB()
	{
		System.out.println("Constructor method referencing");
	}

}
