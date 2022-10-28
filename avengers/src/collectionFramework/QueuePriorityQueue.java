package collectionFramework;

import java.util.PriorityQueue;

public class QueuePriorityQueue 
{
	void meth1()
	{
		PriorityQueue<Object> pq=new PriorityQueue<Object>();
		
		pq.add(10); //Insertion order is not maintained
		//pq.offer("Java"); //Heterogeneous data is not allowed
		//pq.add(null); //Null is not allowed
		pq.offer(50); //Duplicates are allowed
		pq.add(1); //It is available from Java 1.5v
		pq.offer(33); //Default capacity: 11, Size increased by double
		pq.add(10); //It is not synchronized
		pq.offer(96);
		pq.add(100);
		pq.offer(2);
		
		System.out.println(pq);
		System.out.println("------------------------------");
		System.out.println(pq.remove()); //Remove and return the 1st element
		System.out.println(pq);
		System.out.println("------------------------------");
		System.out.println(pq.poll());  //Remove and return the 1st element
		System.out.println(pq);
		System.out.println("------------------------------");
		//pq.clear();
		//System.out.println(pq.remove());
		//System.out.println(pq.poll());
		//System.out.println("------------------------------");
		System.out.println(pq.peek());
		System.out.println(pq);
		
		
	}

	public static void main(String[] args) 
	{
		new QueuePriorityQueue().meth1();

	}

}
