package Array;

public class Array_08 
{
	public boolean FirstLast6(int[] nums)
	{
		
		if(nums[0]==6||nums[nums.length-1]==6)
			return true;
		return false;

	}

	public static void main(String[] args) 
	{
		Array_08 t1 = new Array_08();
		int input[] = {4,8,6,9};
		boolean result =t1.FirstLast6(input);
		System.out.println(">>>>>> "+result);

	}

}
