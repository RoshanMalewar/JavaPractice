package firstavenger;

public class ClassDD {
	static int x= 10;
	static int y = 20;
	
	static
	{
		System.out.println("Test 11 SB1 Called");
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
	}
	
	static void m1()
	{
		int x =100;
		System.out.println("Static meth called");
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		
	}

	public static void main(String[] args) {
		m1();
		// TODO Auto-generated method stub

	}
	static
	{
		System.out.println("Test11 SB2 called");
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		
	}

}
