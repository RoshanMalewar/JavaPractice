package String;

public class String_06 
{
	void meth1(String s)
	{
		//s = "MadaM";
		boolean flag = true;
		
		s = s.toLowerCase();
		
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Given String is palindrom");
		else
			System.out.println("Given String is not palindrom");
		
		
		System.out.println("The entered String is: "+s);

	}
	

	public static void main(String[] args) 
	{
		String_06 t1 = new String_06();
		t1.meth1("Roshan");
		

	}

}
