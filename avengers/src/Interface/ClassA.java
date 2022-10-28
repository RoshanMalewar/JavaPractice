package Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ClassA 
{
	void meth1()
	{
		int arr[]= {10,52,99,100,5};
		System.out.println("Before Array Sorting >>>> "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After Array Sorting >>>> "+Arrays.toString(arr));
		System.out.println("---------------------------------------------------");
		
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(1);
		al.add(56);
		al.add(25);
		al.add(99);
		al.add(15);
		
		System.out.println("Before ArrayList Sorting >>>> "+al);
		//Arrays.sort(al); //C.E sort() method will accept only Arrays 
		Collections.sort(al); //Sort() method accepts only in list of implementations
		System.out.println("After ArrayList Sorting >>>> "+al);
		System.out.println("---------------------------------------------------");
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(75);
		hs1.add(5);
		hs1.add(95);
		hs1.add(15);
		hs1.add(85);
		
		System.out.println("Before Hashset Sorting >>>> "+hs1);
		ArrayList<Integer> al2 = new ArrayList<Integer>(hs1);
		//Collections.sort(hs1); //C.E >> Sort() method only accepts list implementation 
		Collections.sort(al2);
		System.out.println("After Hashset Sorting >>>> "+al2);
		
	}
	
	
	public static void main(String[] args) 
	{
		new ClassA().meth1();
		
	}

}
