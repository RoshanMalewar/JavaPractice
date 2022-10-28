package controlStatement;

public class ThisVeriable 
{
	int a = 10;
	static int b= 20;
	
	void meth1()
	{
		int a = 1000;
		int b = 30;
		
		System.out.println("Instance Veriable: "+this.a);
		
		System.out.println("Static Variable: " +ThisVeriable.b);
		System.out.println("Static Variable: "+this.b);
		
		
		System.out.println("Local Variable:"+b);
		
	}
			

	public static void main(String[] args) 
	{
		ThisVeriable t1 = new ThisVeriable();
		t1.meth1();

	}

}
