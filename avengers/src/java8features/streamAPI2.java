package java8features;

import java.util.ArrayList;

public class streamAPI2 
{
	void meth1()
	{
		System.out.println("Implementing Steream API");
		ArrayList<String> al = new ArrayList<String>();
		al.add("India");
		al.add("Japan");
		al.add("Paris");
		al.add("UK");
		al.add("Russia");
		al.add("Goa");
		
		long number=al.stream().filter(data->data.length()<4).count();
		System.out.println(number);
		
	}

	public static void main(String[] args) 
	{
		new streamAPI2().meth1();

	}

}
