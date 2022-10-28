package collectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapHashmap 
{
	void meth1()
	{
		System.out.println("Implementing Map Interface");
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put(101, "Java"); //Insertion order is not maintained
		map.put("Java", 5000); //Heterogeneous keys are allowed and heterogeneous data is allowed
		map.put(null, null); //Null keys and values are allowed
		map.put(103, "Css"); //Duplicate values are allowed
		map.put(102, "Html"); //It is available from Java 1.2v
		map.put(103, "oracle"); //Default Capacity:16, Load Factor:0.75, Size Increased by double
		System.out.println(map); //It is not synchronized
		System.out.println("-----------------------------------------");
		
		map.put(103, "Css");
		System.out.println(map);
		System.out.println("-----------------------------------------");
		
		System.out.println("Retriving the data by using Keys: "+map.get("Java"));
		System.out.println(map.get(102));
		System.out.println("-----------------------------------------");
		
		System.out.println("Retriving the keys from hashmap");
		HashSet<Object> hs1 = new HashSet<Object>(map.keySet());
		System.out.println("All the keys: "+hs1);
		System.out.println("-----------------------------------------");
		
		System.out.println("Retriving the data by using Iterator");
		
		Iterator<Object> i1 = hs1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("-----------------------------------------");
		
		System.out.println("Retriving the Key-Value pairs from Hashmap");
		
		HashSet<Object> hs2 = new HashSet<Object>(map.entrySet());
		Iterator<Object> i2 = hs2.iterator();
		while(i2.hasNext())
		{
			//System.out.println(i2.next());
			Entry e  = (Entry)i2.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

	public static void main(String[] args) 
	{
		new MapHashmap().meth1();

	}

}
