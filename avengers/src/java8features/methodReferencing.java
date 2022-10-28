package java8features;

import java.util.Arrays;
import java.util.Scanner;

public class methodReferencing 
{
	void show()
	{
		System.out.println("Implementing Method Referencing");
		
		//InterfaceA x =new ClassB()::m1; //Non Static method referencing
		 
		//InterfaceA x=ClassB::m2; //Static method referencing
		
		InterfaceA x = ClassB::new; //Constructor method referencing
		
		x.meth1();
	}

	public static void main(String[] args) 
	{
		new methodReferencing().show();
		
	}

}
