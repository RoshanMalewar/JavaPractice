package Array;

public class Array_12 
{
	public int[] middleWay(int[] a, int[] b)
	{
		return new int[] {a[1],b[1]};
		
	}

	public static void main(String[] args) 
	{
		Array_12 t1 = new Array_12();
		int input1[]= {6,8,9};
		int input2[]= {2,4,7};
		int result[] = t1.middleWay(input1, input2);
		
		for(int data:result)
			System.out.print(data+ " ");

	}

}
