package collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class ClassVector 
{
	void meth1()
	{
		System.out.println("Implementing Vector");
		Vector<Object> v= new <Object> Vector();
		v.add(10); //Insertion Order Is maintained
		v.add("Java"); //Heterogeneous data is allowed
		v.add(null); //null is allowed
		v.add(1); //Duplicates are allowed
		v.add(99); //It is available from Java 1.0 (Legacy Class)
		v.add(12); //Default capacity is 10 [Its size increases by double]
		v.add(10); //It is synchronized by default
		System.out.println(v);
		
		System.out.println("Capacity(): "+v.capacity());
		System.out.println("size(): "+v.size());
		System.out.println("-----------------------------");
			
		v.add(1,500);
		v.add(1000);
		v.add(2,"Hi");
		v.add(1500);
		System.out.println(v);
		System.out.println("Capacity(): "+v.capacity());
		System.out.println("size(): "+v.size());
		System.out.println("-----------------------------");
		
		for (Object o:v)
		{
			System.out.println(o);
		}
		System.out.println("-----------------------------");
		Enumeration<Object>e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

	public static void main(String[] args) 
	{
		new ClassVector().meth1();
	

	}

}
