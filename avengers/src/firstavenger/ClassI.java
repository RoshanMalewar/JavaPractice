package firstavenger;

public class ClassI {
	
	int a =10;
	public String testMethod()
	{
		new ClassI(100,200,"Java");
		System.out.println(40);
		return new ClassI().testMeth3(new ClassI(50).testMeth2())+new ClassI().testMeth4("Hi");
	}
	ClassI()
	{
		System.out.println("Hi");
	}
	public int testMeth2()
	{
		System.out.println(50);
		return 10+15;
	}
	ClassI(int a)
	{
		System.out.println("Java is Awesome");
	}
	public String testMeth3(int a)
	{
		System.out.println(18);
		return "is ";
	}
	ClassI(int a, int b, String s)
	{
		System.out.println(a+b);
		System.out.println(s);
	}
	public String testMeth4(String s)
	{
		System.out.println(88);
		return "good";
	}
	public static void main(String[] args)
	{
		ClassI t1=new ClassI();
		t1.a=10;
		ClassI t2=new ClassI(50);
		t2.a=30;
		System.out.println("Java "+t1.testMethod()+" "+(t1.a+t2.a-30));
		
		// TODO Auto-generated method stub

	}

}
