package String;

import java.util.Scanner;

public class String_02 
{
	void meth1()
	{
		System.out.println("Implementing String Class Methods");
		String s1 ="Java";
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = new String("Java");
		
		//equals(): In String Class equals() will check contents present in the String 
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println("Java".equals("Java"));
		System.out.println("JAVA".equals(s1));
		System.out.println("JAVA".equalsIgnoreCase(s1));
		
		System.out.println("-------------------------------");
		
		// = = : It will check the address locations of String objects
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s4);
		System.out.println(s2==s4);
		System.out.println(s1==s3);
		
		System.out.println("Java"==s1);
		System.out.println("Java"=="Java");
		System.out.println("Java"== new String("Java"));
		
		System.out.println("--------------------------------");
		//System.out.println("Length(): "+s1.length); //C.E. length variable is used to find the length of an array.
		System.out.println("Length(): "+s1.length());
		System.out.println("Concat(): "+s1.concat(" is Awesome"));
		System.out.println("Length(): "+s1.concat(" is Awesome").length());
		System.out.println("s1: "+s1);
		
		System.out.println("charAt(): "+s1.charAt(3));
		System.out.println("charAt(): "+s1.charAt(s1.length()-2));
		System.out.println("-----------------------------------");
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your gender M / F");
		String data=sc.next();
		char gender = data.charAt(0);
		
		switch(gender)
		{
		case 'M':
			System.out.println("User is Male");
			break;
		
		case 'F':
			System.out.println("User is female");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		
		} 
		
		*/
		
		System.out.println("StartsWith(): "+s1.startsWith("J"));
		System.out.println("StartsWith(): "+"Java is Awesome".startsWith(s1));
		System.out.println("StartsWith(): "+"Java is Awesome".startsWith(" ".concat(s1)));
		System.out.println("toLowerCase(): "+s1.toLowerCase());
		System.out.println("toUpperCase(): "+s1.toUpperCase());
		System.out.println("s1: "+s1);
		
		String s5 = "I Love India";
		System.out.println("Substring(int a): "+s5.substring(7));
		System.out.println("Substring(int a, int b): "+s5.substring(2, 6));
		
		System.out.println("replace(): "+s1.replace('a', 'A'));
		System.out.println("s1: "+s1);
		
		String s6 = " Hello World ";
		System.out.println(s6.length());
		
		System.out.println("trim(): "+s6.trim().length());
		System.out.println("Indexof(): "+s1.indexOf('a'));
		System.out.println("LastIndexof(): "+s1.lastIndexOf('a'));
	}

	public static void main(String[] args) 
	{
		String_02 t1 = new String_02();
		t1.meth1();

	}

}
