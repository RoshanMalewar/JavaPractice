package String;

import java.util.Arrays;

public class String_03 

{
	void meth1()
	{
		String date = "8/sep/2022";
		String msg = "I Love India";
		
		String arr1[] =date.split("/");
		System.out.println("arr1>>>>>>>"+Arrays.toString(arr1));
		
		String []arr2 = msg.split(" ");
		System.out.println("arr2>>>>>>>"+Arrays.toString(arr2));
		
		
		String arr3[] = date.split("/",2);
		System.out.println("arr3>>>>>>>"+Arrays.toString(arr3));
		
		System.out.println("--------------------------------------");
		
		String s = "ABCDEF";
		byte arr4[] = s.getBytes();
		System.out.println("arr4>>>>>>>"+Arrays.toString(arr4));
		System.out.println("Retriving the data from byte array by useing Foreach loop");
		
		for(byte x:arr4)
		{
			System.out.print((char)x+" ");     //Type-casting  byte >> char 
		}
		
	}

	public static void main(String[] args) 
	{
		new String_03().meth1(); 

	}

}
