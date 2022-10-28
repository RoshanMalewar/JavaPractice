package collectionFramework;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class HashTable 
{
	void meth1()
	{
		System.out.println("Implementing HashTable");
		Hashtable<Object, Object> ht = new Hashtable<Object, Object>();
		
		ht.put(1, "India"); //Insertion Order is not maintained but sorting 
		ht.put("Russia", 800); //Heterogeneous keys & value are allowed  
		//ht.put(null, null); //Null key or null value not allowed
		ht.put(56, "America");
		ht.put(1, "Japan");
		ht.put(99, "Paris");
		ht.put(45, "Malaysia");
		
		System.out.println(ht);
		
		System.out.println("------------------------------------------");
		System.out.println("Retriving the data using HashSet, insertion Order will not be maintained");
		
		HashSet<Object> hs = new HashSet<Object>(ht.entrySet());
		Iterator<Object> i1 = hs.iterator();
		while(i1.hasNext())
		{
			Entry e = (Entry)i1.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("-------------------------------------------");
		System.out.println("Retriving the data by using LinkedHashSet, Insertion order will be Maintained");
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>(ht.entrySet());
		Iterator<Object> i2 = lhs.iterator();
		while(i2.hasNext())
		{
			Entry e = (Entry)i2.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	
		
	
	}
	

	public static void main(String[] args) 
	{
		
		new HashTable().meth1();

	}

}
