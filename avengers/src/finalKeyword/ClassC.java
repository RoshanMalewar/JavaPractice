package finalKeyword;

public class ClassC 
{
	void meth1()
	{
		System.out.println("Meth1() Called");
		ClassC obj = new ClassC(); //3rd way >> All objects created inside method
	}
	protected void finalize()
	{
		System.out.println("Garbage has been collected");
	}
	public static void main(String[] args) 
	{
		ClassC obj1 = new ClassC();
		ClassC obj2 = new ClassC();
		obj1.meth1();
		
		obj2=obj1; //1st way >> By re-assigning the reference variable
		obj1=null; //2nd way >> by nullifying the reference variable
		obj1.meth1(); //It will generate null pointer exception 
		
		System.gc();  // this is used to call garbage collector manually
		
		//Runtime r=Runtime.getRuntime();
		//r.gc();
		
		
	

	}

}
