package firstavenger;

public class ClassGG {
	int x = 12;
	static int y = 45;
	
	void m1()
	{
		System.out.println("Instance Method m1()");
	}
	void m2()
	{
		System.out.println(x);
		new ClassGG(500).m1();
		System.out.println(y);
		m3();
		System.out.println("Instance Method m2()");
		
	}
	static void m3()
	{
		System.out.println("Static Meth m3()");
	}
	ClassGG(int a)
	{
		y=a;
	}
	ClassGG()
	{
		y=50-30;
	}

	public static void main(String[] args) {
		System.out.println(y);
		m3();
		ClassGG a=new ClassGG();
		System.out.println(a.x);
		a.m2();

	}

}
