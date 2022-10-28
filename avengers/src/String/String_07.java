package String;

public class String_07 
{
	public String makeOutWord(String out,String word)
	{
		return out.substring(0,2)+word+out.substring(2);
	}

	public static void main(String[] args) 
	{
		String_07 t1 = new String_07();
		String result = t1.makeOutWord("<<>>", "Rosh");
		System.out.println(result);

	}

}
