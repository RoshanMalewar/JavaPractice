package firstavenger;

public class ClassJJ 
{
	void display()
	{
		byte x;
		int a = 270;
		double b = 128.128;
		x=(byte)a;
		System.out.println("a and x"+a+" "+x);
		a=(int)b;
		System.out.println("b and a"+b+" "+a);
		//x= b; //C.E. because of using the incorrect typecasting
		System.out.println("b and x"+b+" "+x);
	}

	public static void main(String[] args) 
	{
		ClassJJ t1= new ClassJJ();
		t1.display();

	}

}
