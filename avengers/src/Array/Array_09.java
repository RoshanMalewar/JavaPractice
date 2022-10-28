package Array;

public class Array_09 
{
	public boolean sameFirstLast(int []nums)
	{
		if(nums.length>=1 && nums[0]==nums[nums.length-1])
			return true;
		return false;	
		
	}
			
	public static void main(String[] args) 
	{
		Array_09 t1 = new Array_09();
		int input[] = {9,8,6,6};
		boolean result =t1.sameFirstLast(input);
		System.out.println(">>>>>> "+result);

		
	}
	

}
