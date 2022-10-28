package java8features;

import java.util.ArrayList;

public class streamAPI 
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
		al.forEach((x)->System.out.print(x));
		
	}

	public static void main(String[] args) 
	{
		new streamAPI().meth1();
	
	}

}
