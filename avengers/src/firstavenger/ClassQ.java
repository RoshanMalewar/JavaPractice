package firstavenger;

public class ClassQ {
	
	void meth1(int a, int b, int c)
	{
			
		System.out.println("Meth1()>>The addition is: "+(a+b+c));
		new ClassQ().meth2(10, 2);
		
	}
	void meth2(int a, int b)
	{
		
		System.out.println("Meth2()>>The substraction is: "+(a-b));
		
	}
	ClassQ()
	{
		System.out.println("Default Constructor>> The division is: "+(10/2));
	}
	ClassQ(String s)
	{
		System.out.println(s+(10*2));
	}

	public static void main(String[] args) 
	{
		
		new ClassQ("Multiplication: ").meth1(10, 20, 30);
		//ClassQ t1=new ClassQ();
		
		// TODO Auto-generated method stub

	}

}
