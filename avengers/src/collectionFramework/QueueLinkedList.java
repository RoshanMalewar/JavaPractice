package collectionFramework;

import java.util.LinkedList;
import java.util.List;

public class QueueLinkedList 
{
	void meth1() 
	{
	List<Object> list = new LinkedList<Object>();    //Trying hold child object with parent reference
	LinkedList<Object> ll=new LinkedList<Object>();   //Trying hold child object with child reference
	
	list.add(10);
	//list.offer(20); //C.E >> We are accessing Queue interface methods
	
	ll.add(100);
	ll.offer(200);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
