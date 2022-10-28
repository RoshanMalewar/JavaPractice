package firstavenger;

public class ClassM {
	
	int a =10;
	
	void meth1()
	{
		System.out.println(++a); 
		System.out.println(a++);
		a++;
		System.out.println(a--);
		System.out.println(a--);
		a--;
		System.out.println(--a);
		System.out.println(a++);
		++a;
		System.out.println(a--);
		a--;
		System.out.println(--a);
		System.out.println(++a);
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		new ClassM().meth1();
		// TODO Auto-generated method stub

	}

}
