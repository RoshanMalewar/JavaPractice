package Array;

public class Array_11 
{
	public int sum3(int []nums)
	{
		return nums[0]+nums[1]+nums[2];
	}

	public static void main(String[] args) 
	{
		Array_11 t1 = new Array_11();
		int input[]= {6,8,9};
		int result=t1.sum3(input);
		System.out.println(">>>>>>> "+result);
	

	}

}
