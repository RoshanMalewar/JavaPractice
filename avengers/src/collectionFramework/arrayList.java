package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList 
{
	void meth1()
	{
		System.out.println("Implementing Array list");
		ArrayList <Integer> al = new ArrayList<Integer>();
		al.add(10); //Insertion order is maintained
		//al.add("Java"); //Heterogeneous Data is allowed
		//al.add(null); //Null is allowed
		al.add(1); //Duplicates are allowed
		al.add(12); //It is available from java 1.2 v
		al.add(86); //It's default capacity is 10  
		al.add(99); //It is not synchronized by default
		al.add(10);
		System.out.println("ArrayList:" +al);
		System.out.println("get(): "+al.get(5));
		System.out.println("get(): "+al.get(al.size()-1));
		System.out.println("size: "+al.size());
		System.out.println("-----------------------------------");
		
		System.out.println("Retriving the using for loop");
		for(int i=0;i<al.size()-1;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("-----------------------------------");
		
		System.out.println("Retriving the data in reverse order using for loop");
		for(int i=al.size()-1;i>=0;--i)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("-----------------------------------");
		
		System.out.println("Retriving the data using Foreach loop");
		for(int data:al)
		{
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("Retriving the data using Iterator Interface");
		Iterator <Integer> i= al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
		System.out.println("--------------Methods--------------");
		System.out.println();
		al.add(al.size()-1,100);
		System.out.println(al);
		al.add(0,500);
		System.out.println(al);
		System.out.println("isEmpty(): "+al.isEmpty());
		//al.clear();
		//System.out.println("isEMpty(): "+al.isEmpty());
		System.out.println("contains(): "+al.contains(99));
		System.out.println("---------------remove()------------");
		al.remove((Object)100); //Here Object is used to remove data object from the arraylist 
		System.out.println(al);
		System.out.println(">>>>>>"+al.remove(1)); //By using this we can remove the data object on that index position
		System.out.println(al);
		System.out.println(">>>>>>"+al.remove((Object)100));
		System.out.println(al);		
		
	}
	public static void main(String[] args) 
	{
		new arrayList().meth1();
		
	}

}
