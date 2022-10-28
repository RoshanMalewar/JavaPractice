package firstavenger;

public class ClassL
{
	int a =10;
	void meth1()
	{
		System.out.println(++a);
		a++;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		ClassL aobj = new ClassL();
		aobj.meth1();
		// TODO Auto-generated method stub

	}

}
