package firstavenger;

public class ClassB {
	
	
	int meth1()
	{
		System.out.println("Meth1() Called");
		return 100;
	}

	public static void main(String[] args)
	{
		
		ClassA aobj1 = new ClassA();
		ClassA aobj2 = new ClassA();
		
		int aobj1hashCode = aobj1.hashCode();
		int aobj2hashCode = aobj2.hashCode();
		
		System.out.println("aobj1 hashcode is :"+aobj1hashCode);
		System.out.println("aobj2 hashcode is :"+aobj2hashCode);
		System.out.println("-------------------------------------");
		
		System.out.println(aobj1.equals(aobj2));
		System.out.println(aobj1.equals(aobj1));
		System.out.println("-------------------------------------");
		
		System.out.println(aobj1.getClass());
		System.out.println(aobj2.getClass());
		System.out.println("-------------------------------------");
		
		System.out.println(aobj1.toString());
		System.out.println(aobj2.toString());
		
		
		
		// TODO Auto-generated method stub

	}

}
