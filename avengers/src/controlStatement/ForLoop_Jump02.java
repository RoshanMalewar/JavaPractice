package controlStatement;

public class ForLoop_Jump02 
{
	void meth1(int b)
	{
		int a = 10;
		while(a<=20)
		{
			if(a==15)
			{
				while(b<=30)
				{
					if(b==25)
					{
						break;
					}
					System.out.println("b Value : "+b);
					b++;
				}
			}
			System.out.println("a value : "+a);
			a++;
		}
	}

	public static void main(String[] args) 
	{
		ForLoop_Jump02 t1 = new ForLoop_Jump02();
		t1.meth1(50);

	}

}
