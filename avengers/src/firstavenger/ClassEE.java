package firstavenger;

public class ClassEE {
	static int x = m1();
	
	public static void main(String[] args) {
		System.out.println(ClassEE.x);
		
	}
	static
	{
		System.out.println(x);
		ClassEE.x=x+20;
	}
	static int m1()
	{
		ClassEE.x=50;
		return m2();
	}
	
	static int m2()
	{
		System.out.println(ClassEE.x);
		return 100;
	}

}
