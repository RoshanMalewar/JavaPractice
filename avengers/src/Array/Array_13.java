package Array;

public class Array_13 
{
	public int[] makeLast(int[] nums)
	{
		int arr[] = new int[nums.length*2];
		arr[arr.length-1]=nums[nums.length-1];
		return arr;
	}
	

	public static void main(String[] args) 
	{
		Array_13 t1 = new Array_13();
		int input[]= {1,2,3,6};
		int result[]=t1.makeLast(input);
		
		for(int data:result)
			System.out.print(data+" ");
		
	}

}
