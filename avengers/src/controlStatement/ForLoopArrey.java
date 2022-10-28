package controlStatement;

public class ForLoopArrey 
{
	void meth1()
	{
		int arr[] = {10,20,30,40,50};
		
		System.out.println("Element present in 0th Index" +arr[0]);
		System.out.println("Element present in 1st Index"+arr[1]);
		System.out.println("Element present in 2nd Index"+arr[2]);
		System.out.println("Element present in 3rd Index"+arr[3]);
		System.out.println("Element present in 4th Index"+arr[4]);
		
		
		System.out.println("Retriving the data from array by using For Loop");
		
		for(int index=0; index<=4;index++)
		{
			System.out.println(arr[index]);
		}
		System.out.println("-------------------------------------");
		
		System.out.println("Retriving the data from array in REVERSE ORDER by using For Loop");
		
		for(int index = 4; index>=0;index--)
		{
			System.out.println(arr[index]);
		}
		System.out.println("-------------------------------------");
				
		System.out.println("Retriving the data from array in REVERSE ORDER by using Foreach Loop");
		
		for(int data:arr)
		{
			System.out.println(data);
		}
		
		//For-Loop will be using index values to retrive the data from array
		//Foreach-Loop will be working on STREAMING data (In the same order in which the data is present in array) to retrive the data from array
		
	}
	
	

	public static void main(String[] args) 
	{
		ForLoopArrey t1=new ForLoopArrey();
		t1.meth1();
	}

}
