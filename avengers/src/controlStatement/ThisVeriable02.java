package controlStatement;

public class ThisVeriable02 
{
	void meth1()
	{
		System.out.println("Meth1() Called");
		//new ThisVeriable02().meth2();
		this.meth2();
		//meth2(); //Compiler will by default add "This" keyword for calling meth2() 
	}
	
	void meth2()
	{
		System.out.println("Meth2() Called");
	}
	

	public static void main(String[] args)
	{
		ThisVeriable02 t1 = new ThisVeriable02();
		t1.meth1();
		
		//this.meth1(); //C.E >> We can not use "This" keyword in static area
		//meth1(); //C.E

	}

}
