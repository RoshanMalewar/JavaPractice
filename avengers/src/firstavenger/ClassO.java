package firstavenger;

public class ClassO {
	
	void meth1()
	{
		int a=10;
		int b=a++ + ++a;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

	public static void main(String[] args) {
		
		new ClassO().meth1();
		// TODO Auto-generated method stub

	}

}
