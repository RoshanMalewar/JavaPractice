package String;

public class String_05 
{
	public String makeABBA(String a, String b)
	{
		return a+b+b+a;
	}

	public static void main(String[] args) 
	{
		String_05 t1 = new String_05();
		String result = t1.makeABBA("Roshan", "Manashri");
		System.out.println(result);

	}

}
