package java8features;

public class lambdaExpressions 
{
	void show()
	{
		System.out.println("Implementing Lambda Expressions");
		InterfaceA x=()->System.out.println("Hello World");
		x.meth1();
		
		InterfaceB y=(int a, int b)->System.out.println("Addition: "+(a+b));
		y.meth2(10, 20);
		
		InterfaceC z=(int p, int q)->
		{
			if(p>q)
			{
				System.out.println("If Block Executed");
				return p+100;
			}
			else
			{
				System.out.println("Else Block Executed");
				return q+50;
			}
			
		};
		
		System.out.println("Returning value from a Lambda Expression: "+z.meth3(1, 2));
		
	}
	public static void main(String[] args) 
	{
		new lambdaExpressions().show();
		
	}

}
