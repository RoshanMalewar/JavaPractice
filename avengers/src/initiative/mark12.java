package initiative;

public class mark12 {
	
	void meth1(int a, int b)
	{
		System.out.println("Meth1() Called");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}
	int meth2()
	{
		System.out.println("Meth2() called");
		return 99;
	}

	public static void main(String[] args) {
		
		mark12 A=new mark12();
		A.meth1(A.meth2(), 1);
		// TODO Auto-generated method stub

	}

}
