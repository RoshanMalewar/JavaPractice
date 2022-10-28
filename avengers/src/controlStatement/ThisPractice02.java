package controlStatement;

public class ThisPractice02 
{
	public int meth1(int a, int b)
	{
		System.out.println("Meth1() Called");
		System.out.println(100);
		return (a+b)+10+(a-b);
	}
	public int meth2()
	{
		System.out.println("Meth2() Called");
		return this.meth3()+8;
	}
	
	public ThisPractice02()
	{
		this("Java Is Awesome");
		System.out.println(50);
	}
	int meth3()
	{
		System.out.println("Meth3() Called");
		return 10;
	}
	public String meth4(int a, String s)
	{
		System.out.println("Meth4() Called");
		a =a+4;
		System.out.println("a value is >>>> "+a);
		System.out.println("s value is >>>> "+s);
		return s+" is Object oriented programming language";
	}
	public ThisPractice02(String s)
	{
		String result = this.meth4(this.meth1(this.meth2(), 5), "Java");
		System.out.println(result);
		System.out.println(s);
	}

	public static void main(String[] args) 
	{
		new ThisPractice02();

	}

}
