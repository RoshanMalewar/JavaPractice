package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamAPI3 
{
	void meth1()
	{
		System.out.println("Implementing Stream API");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(45);
		al.add(75);
		al.add(5);
		al.add(12);
		al.add(1);
		System.out.println(al);
		
		Stream<Integer> s1=al.stream();
		
		Stream<Integer> s2 = s1.map((x)->x*2);
		
		List<Integer> li = s2.collect(Collectors.toList());
		System.out.println(li);
		
		al.stream().map((x)->x*2).collect(Collectors.toList());
		
	}

	public static void main(String[] args) 
	{
		new streamAPI3().meth1();

	}

}
