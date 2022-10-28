package firstavenger;

public class ClassC {
	
	void meth1()
	{
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		return;
	}
	int meth2(int a, int b)
	{
		System.out.println("Meth2() Called");
		System.out.println("a"+a);
		System.out.println("b"+b);
		return(a+b)+50;
	}
	String meth3(int a)
	{
		System.out.println("Meth3() called");
		System.out.println("Java Is Awesome");
		if(a>50)
		{
			System.out.println("If Block executed");
			return "Hi";
		}
		else
		{
			System.out.println("Else block executed");
			return "Hello";
		}
		
	}
	int meth4()
	{
		System.out.println("Meth4() called");
		return 'A';
	}

	public static void main(String[] args) {
		System.out.println("Start");
		ClassC aobj = new ClassC();
		aobj.meth1();
		System.out.println("-----------------");
		System.out.println("=====>"+aobj.meth2(10, 20));
		System.out.println("-----------------");
		System.out.println("=====>"+aobj.meth3(100));
		System.out.println("-----------------");
		System.out.println("=====>"+aobj.meth4());
		System.out.println("End");
		
		// TODO Auto-generated method stub

	}

}
