package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemap 
{
	void meth1()
	{
		System.out.println("Implementing TreeMap");
		TreeMap<Object, Object> tm =new TreeMap<Object, Object>();
		tm.put(10, "India"); //Insertion Order is not maintained but sorting order is maintained
		//tm.put("Germany", 9); //Heterogeneous keys are not allowed, Heterogeneous values are allowed 
		tm.put(9, "Germany");
		//tm.put(null, null); //Null keys are not allowed, Null value is allowed
		tm.put(9, null);
		tm.put(56, "America"); //Duplicate Keys and Duplicate values are allowed, It will overwrite with the latest data
		tm.put(1, "Japan"); //It is available for Java 1.2v
		tm.put(99, "Paris"); //Default Capacity is 16, Load factor is 0.75,
		tm.put(45, "Malasiya"); //It is not synchronized
		System.out.println(tm);
		
		System.out.println("------------------------------------------");
		System.out.println("Retriving the data using HashSet, insertion Order will not be maintained");
		
		HashSet<Object> hs = new HashSet<Object>(tm.entrySet());
		Iterator<Object> i1 = hs.iterator();
		while(i1.hasNext())
		{
			Entry e = (Entry)i1.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("-------------------------------------------");
		System.out.println("Retriving the data by using LinkedHashSet, Insertion order will be Maintained");
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>(tm.entrySet());
		Iterator<Object> i2 = lhs.iterator();
		while(i2.hasNext())
		{
			Entry e = (Entry)i2.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}


	public static void main(String[] args) 
{
		new Treemap().meth1();
		
	}

}
