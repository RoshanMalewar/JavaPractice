package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassB 
{
	void meth1()
	{
		System.out.println("Passing Userdefined object in arrayList");
		ArrayList<ClassA>al = new ArrayList<ClassA>();
		
		ClassA aobj1 = new ClassA("Roshan", 101, "Java");
		ClassA aobj2 = new ClassA("Manashree", 102, "SDET");
		ClassA aobj3 = new ClassA("Debayan",103,"Technical");
		//ClassA aobj4 = new ClassA("Swapnil", 104, "SalesForce");
		//ClassA aobj5 = new ClassA("Roshan S", 105, "DevOps");
		
		al.add(aobj1);
		al.add(aobj2);
		al.add(aobj3);
		al.add(new ClassA("Swapnil", 104, "SalesForce"));
		al.add(new ClassA("Roshan S", 105, "DevOps"));
		
		System.out.println("Object inserted in ArrayList");
		System.out.println();		
		System.out.println(al);
		System.out.println();
		System.out.println("Retriving the data by using Iterator");
		
		Iterator<ClassA> i= al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}	
	}

	public static void main(String[] args) 
	{
		new ClassB().meth1();

	}

}
