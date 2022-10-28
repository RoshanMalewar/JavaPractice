package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_02
{
	void meth1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many tickets you need?");
		String names[] =new String[sc.nextInt()];
		System.out.println("You need "+names.length+" tickets");
		System.out.println("Please enter "+names.length+" names");
		
		for(int i=0;i<names.length;i++)
		{
			names[i]=sc.next();
		}
	//	System.out.println("Data Present in array >>>>>>>>> "+names);
		System.out.println("Data Present in Array >>>>>>>>> "+Arrays.toString(names));
		System.out.println("Retriving the data by using Foreach Loop");
		
		for(String data:names)
		{
			System.out.println(data+" ");
		}
		System.out.println();
		
		//Retrieving the last but one element if the length of array is >= 2
		if(names.length>=2)
		{
			System.out.println(">>>>>>"+names[names.length-2]);
		}
		else
		{
			System.out.println(">>>>>>"+names[names.length-1]);
		}
		
	}

	public static void main(String[] args) 
	{
		new Array_02().meth1();

	}

}
