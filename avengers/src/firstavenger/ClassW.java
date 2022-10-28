package firstavenger;

public class ClassW 
{
	int a = 20;
	static int b = 10;
	
	void meth1()
	{
		System.out.println("--------------Normal Method----------------");
		System.out.println("Instance veriable value: "+a);
		System.out.println("Static Variable Value: "+b);
	}
	
	static void meth2()
	{
		System.out.println("--------------Static Method----------------");
		System.out.println("\"Instance veriable value: "+new ClassW().a);
		System.out.println("Static Variable Value: "+b);
		
	}

	public static void main(String[] args) 
	{
		ClassW t1 = new ClassW();
		t1.meth1();
		meth2();        //1 way of Calling Static method
		t1.meth2();     //2nd way of Calling Static method
		ClassW.meth2();  //3rd way of Calling Static method
		// TODO Auto-generated method stub

	}

}
