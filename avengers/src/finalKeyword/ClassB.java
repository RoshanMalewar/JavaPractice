package finalKeyword;

public class ClassB extends ClassA
{
	void meth1()
	{
		System.out.println("Class B method");
	}
	

	public static void main(String[] args)
	{
		ClassA aobj = new ClassB();
		aobj.meth1();
	}

}
