package String;

public class String_01 
{
	void meth1()
	{
		String s1 = "Java";
		String s2 = new String ("Java");
		
		char arr[]= {'J','a','v','a'};
		String s3 = new String(arr);
		
		String s4= new String(arr, 2,2);
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		
	}
	
	void meth2()
	{
		String s = "Java";
		
		System.out.println("Before concatination s: "+s);
		
		System.out.println("Concatination Result: "+s.concat(" is awesome"));
		//s=s.concat(" is Awesome");
		
		System.out.println("After concatination s: "+s);
		
		
	}

	public static void main(String[] args) 
	{
		String_01 t1 = new String_01();
		t1.meth1();
		System.out.println("----------------------------");
		t1.meth2();
		// TODO Auto-generated method stub

	}

}
