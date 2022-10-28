package Array;

public class Array_06 {
	
	int[] meth1()
	{
		int arr []= {1,2,3};//,{2,3,4},{1,2,2}};
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==2 && arr[i+1]==3)
			arr[i+1]=0;
		}
		return arr;

	}
	

	public static void main(String[] args) {
		
		Array_06 t1 = new Array_06();
		int result[] = t1.meth1();
		for(int data:result)
		{
			System.out.println(data+" ");
		}
		// TODO Auto-generated method stub

	}

}
