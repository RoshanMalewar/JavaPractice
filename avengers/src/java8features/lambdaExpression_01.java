package java8features;

public class lambdaExpression_01 
{
	void show()
	{
		System.out.println("Implementing Lambda expressions");
		InterfaceAB aobj =(x) -> System.out.println(x);
		aobj.meth1(100);
	}

	public static void main(String[] args) 
	{
		new lambdaExpression_01().show();

	}

}
