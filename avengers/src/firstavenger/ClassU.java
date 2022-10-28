package firstavenger;

public class ClassU 
{
	int a; //Instance Variable
	static int b;  //Static Variable
	ClassU()
	{
		a++;
		b++;
		System.out.println("Instance Variable: "+a);
		System.out.println("Static Variable: "+b);
		System.out.println("---------------------");
	}

	public static void main(String[] args) 
	{
		new ClassU();
		new ClassU();
		new ClassU();

	}

}
