package initiative;

public class mark13 {
	
	int meth1(int a, int b)
	{
		System.out.println(a);
		System.out.println(a-b);
		return new mark13().meth4(a-1, "Hi");
	}
	String meth2(int x)
	{
		System.out.println(x-new mark13().meth1(200, 199));
		System.out.println(x);
		return "JAVA";
	}
	String meth3(int a, int b, String s)
	{
		System.out.println(a);
		System.out.println(a+a);
		System.out.println(a+b);
		return s;
		
	}
	int meth4(int a, String s)
	{
		System.out.println(a);
		System.out.println(s);
		return a+a;
	}
	String meth5(String s)
	{
		return s;
	}

	public static void main(String[] args) {
		System.out.println(new mark13().meth5(new mark13().meth3(15, 25, new mark13().meth2(500))));
		// TODO Auto-generated method stub

	}

}
