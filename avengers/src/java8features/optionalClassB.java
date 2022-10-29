package java8features;

import java.util.Arrays;

public class optionalClassB 
{
	void meth1()
	{
		int arr [] = {1,5,7,3,4,9,2,6,8};
		for(int x:arr)
			System.out.print(x+ " ");
		System.out.println();
		
		Arrays.sort(arr);
		for(int x:arr)
			System.out.print(x+ " ");
		System.out.println();
		
		Arrays.parallelSort(arr,4,7);
		for(int x:arr)
			System.out.print(x+ " ");
		System.out.println();
		
	}

	public static void main(String[] args) 
	{
		optionalClassB bobj = new optionalClassB();
		bobj.meth1();

	}

}
