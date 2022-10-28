package String;

public class String_08 
{
	void meth1()
	{
		String s1 = new String("Java");
		StringBuffer buffer1 = new StringBuffer("Java");
		StringBuilder builder1 = new StringBuilder("Java");
		
		s1.concat(" is awesome");
		//s=s1.concat(" is awesome");
		buffer1.append(" is awesome");
		builder1.append(" is awesome");
		
		System.out.println("String data: "+s1);
		System.out.println("StringBuffer data: "+buffer1);
		System.out.println("Stringbuilder data: "+builder1);
	}
	
	void meth2()
	{
		String s1 = new String("Java");
		StringBuffer buffer1 = new StringBuffer("Java");
		StringBuilder builder1 = new StringBuilder("Java");
		
		String s2 = new String("Java");
		StringBuffer buffer2 = new StringBuffer("Java");
		StringBuilder builder2 = new StringBuilder("Java");
		
		/* SCP is a special memory allocated only for String class object
		   Whenever we are using String buffer or String Builder Objects will be created
		   inside Heap Memory
        */
		
		//Using equals() in String class, StringBuffer class and StringBuilder Class
		
		System.out.println("Comparing String Class: "+s1.equals(s2));
		System.out.println("Comparing StringBuffer Class: "+buffer1.equals(buffer2));
		System.out.println("Comparing StringBuilder Class: "+builder1.equals(builder2));
		
		//Using == operator on String class, StringBuffer class and StringBuilder Class
		
		System.out.println("=======================================");
		System.out.println("String Class: "+s1==s2);
		System.out.println("StringBuffer Class: "+(buffer1==buffer2));
		System.out.println("StringBuilder Class: "+(builder1==builder2));
		
		//Q: How to check the contents present inside StringBuffer (or) StringBuilder
		
		System.out.println("============ Comparing the contents of StringBuffer & StringBuilder ==========");
		System.out.println(buffer1.toString().equals(buffer2.toString()));
		System.out.println(builder1.toString().equals(builder2.toString())); 
		
	}

	public static void main(String[] args) 
	{
		String_08 t1 = new String_08();
		t1.meth1();
		System.out.println("-------------------------------------");
		t1.meth2();
		
		

	}

}
