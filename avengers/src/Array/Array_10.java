package Array;

public class Array_10 
{
	public boolean commonEnd(int[] a, int[] b)
	{
		if(a[0]==b[0] || a[a.length-1]==b[b.length-1])
			return true;
		return false;
		
	}

	public static void main(String[] args) 
	{
		Array_10 t1 = new Array_10();
		int input1[] = {9,8,6,6};
		int input2[] = {6,8,9};
		boolean result =t1.commonEnd(input1,input2);
		System.out.println(">>>>>> "+result);

	}

}
