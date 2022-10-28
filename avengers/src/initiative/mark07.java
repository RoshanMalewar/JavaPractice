package initiative;

public class mark07 {
	
	void meth1(int a, int b)
	{
		System.out.println("Meth1() Called");
		System.out.println(a);
		
	}
	
	int meth2() 	{
		
		System.out.println("Meth2() Called");
		return 10;
	}
	
	int meth3(int a, int b, int c)
	{
		System.out.println("meth3() called");
		return a+b+c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		mark07 A= new mark07();
		A.meth1(10, 20);
		System.out.println("================");
		int result = A.meth2();
		System.out.println("Result for meth2(): "+result);
		System.out.println("================");
		int result2 = A.meth3(5, 5, 5);
		System.out.println("Result for meth3(): "+result2);
		System.out.println("================");
		System.out.println("End");
		

	}

}
