package firstavenger;

public class ClassJ {
	
	void meth1() 
	{
		System.out.println("Meth1 Called");
	}
	
	public ClassJ(int i)
	{
		System.out.println("Parameterized Constructor: "+i);
		new ClassJ();
	}
	private ClassJ()
	{
		System.out.println("Default Constructor");
	}

	public static void main(String[] args)
	{
		ClassJ aobj = new ClassJ(50);
		aobj.meth1();
		
		// TODO Auto-generated method stub

	}

}
