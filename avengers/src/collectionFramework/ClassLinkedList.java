package collectionFramework;

import java.util.LinkedList;
import java.util.ListIterator;

public class ClassLinkedList 
{
	void meth1()
	{
		System.out.println("Implementing Linked List");
		LinkedList<Object> ll = new LinkedList<Object>();
		
		ll.add(10); //Insertion order is maintained
		ll.add("Java"); //Heterogeneous data is allowed
		ll.add(null); //Null is allowed
		ll.add(1); //Duplicates are allowed
		ll.add(99); //It is available from java 1.2v
		ll.add(35); //Default Capacity is: 0 [Its size increases by double]
		ll.add(10); //It is not synchronized
		
		System.out.println(ll);
		System.out.println("----------------------------------");
		ListIterator<Object>li=ll.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println();
		
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
		//In linked Lists data will be stored in the form of NODES
			
	}
	

	public static void main(String[] args) 
	{
		new ClassLinkedList().meth1();

	}

}
