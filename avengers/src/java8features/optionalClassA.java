package java8features;

import java.util.Optional;

/**
 * @author Roshan
 *
 */
/**
 * @author Roshan
 *
 */
public class optionalClassA 
{
	void meth1()
	{
		String arr[] = new String[5];
		arr[0] = "India";
		arr[1] = "Japan";
		System.out.println(arr[0].length());
		
		Optional<String> o = Optional.ofNullable(arr[0]);
		System.out.println(">>>>> "+o);
		
		if(o.isPresent())
		{
			System.out.println("Data is Present");
			System.out.println(o.get());
			System.out.println(o.get().length());
			
		}
		else
		{
			System.out.println("Its Empty");
		}
		
	}

	public static void main(String[] args) 
	{
		
		new optionalClassA().meth1(); 
	}

}

