package controlStatement;

public class ThisVeriable04 
{
	void meth1()
	{
		System.out.println("Meth1() Called");
		this.meth2(10, 20).meth3();
	}
	
	ThisVeriable04 meth2(int a, int b)
	{
		System.out.println("Meth2() Called: "+ (a+b));
		return this;
	}
	void meth3()
	{
		System.out.println("Meth3() Called");
		this.meth4(); //We can access a static method using this keyword, but we can't use 'this' inside static area/context
		
	}
	
	static void meth4()
	{
		System.out.println("Meth4() called");
	}

	public static void main(String[] args) 
	{
	
		ThisVeriable04 t1 = new ThisVeriable04();
		t1.meth1();

	}

}
