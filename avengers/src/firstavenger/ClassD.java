package firstavenger;

public class ClassD {
	
	
	int i;
	byte b;
	short s;
	long l;
	
	float f;
	double d;
	
	char c;
	boolean flag;
	
	void meth1()
	{
		System.out.println("Printing the 8 primitive data types");
		System.out.println("Default value : "+i);
		System.out.println("Default value : "+b);
		System.out.println("Default value : "+s);
		System.out.println("Default value : "+l);
		
		System.out.println("Default value : "+f);
		System.out.println("Default value : "+d);
		
		System.out.println("Default value : "+c);
		System.out.println("Default value : "+flag);
	}
	
	void meth2()
	{
		System.out.println("Meth2() Clalled");
		int a = 10;
		int b = 10;
		int c = a+b;
		System.out.println("C value : "+c);
		
		byte b1 = 10;
		byte b2 = 10;
		byte b3 = (byte)(b1+b2);
		System.out.println("b3 Value :"+b3);
		
		float f=10.9F;
		System.out.println("The value of float : "+f);
		
		long x = 2147483648L;
		System.out.println("Long value : "+x);
				
	}
	
	

	public static void main(String[] args) {
		
		ClassD aobj = new ClassD();
		aobj.meth1();
		
		System.out.println("--------------------");
		aobj.meth2();
		
		// TODO Auto-generated method stub

	}

}
