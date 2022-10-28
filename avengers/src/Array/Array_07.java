package Array;

public class Array_07 {
	
	
	int meth1(int []arr)
	{
		if(arr.length>=2)
			return arr[0]+arr[1];
		else if(arr.length==1)
			return arr[0];
		else
			return 0;
	}
	

	public static void main(String[] args) {
		
		Array_07 t1 = new Array_07();
		int input[] = {20,30,40,50};
		int result=t1.meth1(input);
		System.out.println(result);
	}

}
