package firstavenger;

public class ClassE {
	
	int a=10; //Instance Variable
	static int b=20; //Static Variable
	
	int x; //Instance Variable
	static int y; //Static Variable
	
	boolean flag; //Instance Variable
	
	void meth1()
	{
		int c = 30; //Local Variable
		
		System.out.println("Meth1 called");
		
		System.out.println("Instance veriable a: "+a);
		System.out.println("Instance variable using class object a: " +new ClassE().a);
		System.out.println("-------------------------------------");
		System.out.println("Static Variable b:"+b);
		System.out.println("Static variable using class object b: " +new ClassE().b);
		System.out.println("Static variable using class identifier b: " +ClassE.b);
		System.out.println("-------------------------------------");
		System.out.println("Local Variable c: "+c); 
		
	}
	
	void meth2()
	{
		System.out.println("Meth2 called");
		int c; //Local Variable
		int z; //Local Variable
		System.out.println("Instance Variable x: "+x);
		System.out.println("Instace Variable Flag: "+flag);
		System.out.println("Static Variable y: "+y);
	}
	
	void meth3()
	{
		System.out.println("Meth3 called");
		int a = 100; //Local Variable
		int b = 200; //Local Variable
		int c = 300; //Local Variable
		
		System.out.println("Calling instance variable a: "+new ClassE().a);
		System.out.println("Calling Static variable b: "+ClassE.b);
		System.out.println("Calling Local Variable a: "+a);
		System.out.println("Calling Local Variable b: "+b);
		System.out.println("Calling Local Variable c: "+c);
	}

	public static void main(String[] args) 
	{
		ClassE aobj = new ClassE();
		aobj.meth1();
		System.out.println("=======================================");
		aobj.meth2();
		System.out.println("=======================================");
		aobj.meth3();
		
		// TODO Auto-generated method stub

	}

}
