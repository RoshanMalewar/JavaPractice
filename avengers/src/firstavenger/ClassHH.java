package firstavenger;

public class ClassHH {
	
	public void implicit()
	{
		System.out.println("Implementing Implisit Typecasting");
		byte b = 20;
		int i = b;
		
		System.out.println("byte value: "+b);
		System.out.println("int value: "+i);
		
		System.out.println("------------------------");
		
		char c = 'A';
		int x = c;
		
		System.out.println("char value: "+c); //A
		System.out.println("int value: "+x);  //65 >> Ascii Value
		
	}
	int meth1()
	{
		System.out.println("Meth1() Called");
		System.out.println("int & char are compatible");
		return 'A'; //65 >> Ascii Value of A
	}
	
	public void explicit()
	{
		System.out.println("Implementing Explisit Typecasting");
		int i =50;
		byte b1 = (byte)i;
		System.out.println("int value: "+i); //50
		System.out.println("byte value: "+b1); //50
		System.out.println("--------------------");
		
		int x = 500;
		byte b2 = (byte)x;
		
		System.out.println("int value: "+x); // 500
		System.out.println("byte value: "+b2); //-12
		
		//[minimum range + (result - Maximum range -1)]
		//-128 +(500-128) >>>>> -128 + (372) >>>>> 344
		//-128 +(244-128) >>>>> -128+ (116)  >>>>> -12
		
		System.out.println("---------------------");
		
		float f = 10.9991f;
		byte b3 = (byte)f;
		
		System.out.println("float value: "+f); //10.9991
		System.out.println("byte value: "+b3); //10 
		
		
	}

	public static void main(String[] args) 
	{
		ClassHH t1=new ClassHH();
		t1.implicit();
		System.out.println("==================");
		System.out.println(t1.meth1()+'A');
		System.out.println("==================");
		t1.explicit();

	}

}
