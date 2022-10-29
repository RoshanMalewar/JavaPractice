package java8features;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamAPI4 
{
	void meth1()
	{
//		HashSet <Integer> hs = new HashSet<Integer>();
//		hs.add(10);
//		hs.add(1);
//		hs.add(12);
//		hs.add(15);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(1);
		al.add(12);
		al.add(15);
		System.out.println(al);
				
//		System.out.println(hs);
//		Stream <Integer> s1=hs.stream();
//		Stream <Integer> s2 = s1.sorted();
//		List<Integer> li = s2.collect(Collectors.toList());
//		System.out.println(li);
		
		List<Integer> li = al.stream().sorted().collect(Collectors.toList());
		System.out.println(li);
	}

	public static void main(String[] args) 
	{
		new streamAPI4().meth1();

	}

}
