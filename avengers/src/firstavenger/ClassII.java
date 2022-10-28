package firstavenger;

public class ClassII {
	
	public void implicit()
	{
		byte b = 10;
		System.out.println("The byte value is: "+b);
		
		short s = b;
		System.out.println("The Short value is: "+s);
		s++;
		
		int i = s++;
		System.out.println("The int value is: "+i);
		System.out.println("The Short value is: "+s);
		
		long l = i;
		System.out.println("The long value is: "+(--l));
		
		float f = l;
		System.out.println("The value of float is: "+(f+b));
		
		double d = (--f);
		System.out.println("The value of double is: "+d);
		show();
		
		if(!(d==f))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("NOT Equal");
		}		
	}

	public static void main(String[] args) {
		ClassII t1= new ClassII();
		t1.implicit();
	}
	static void show()
	{
		char c ='A';
		int a = ++c;
		System.out.println(a);
		ClassII t2 = new ClassII();
		String s = t2.meth1();
		System.out.println(s);
	}
	String meth1()
	{
		String s = "Implicit casting is done by the compiler Automatically";
		return s;
	}

}
