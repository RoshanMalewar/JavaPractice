package String;

public class String_04 
{
	public String helloName(String name)
	{
		return "Hello "+name+"!";
		
	}

	public static void main(String[] args) 
	{
		String_04 t1 = new String_04();
		String result = t1.helloName("Manashree");
		System.out.println(result);

	}

}
