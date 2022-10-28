package firstavenger;

public class ClassN {
	
	void meth1()
	{
		int a=1;
		int b=2;
		int c;
		int d;
		c=++b;
		d=a++;
		c++;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		System.out.println("d= "+d);
						
	}

	public static void main(String[] args) 
	{
		new ClassN().meth1();
		// TODO Auto-generated method stub

	}

}
