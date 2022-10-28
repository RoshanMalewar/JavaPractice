package initiative;

public class mark09 {
	
	void meth1()
	{
		System.out.println(10);
		System.out.println(64);
		System.out.println("End");
		
	}
	
	int meth2(int a, int b, int c) 	
	{
		
		System.out.println(a);
		mark09 A=new mark09();
		String s = A.meth5(100, "Java is Awesome");
		System.out.println(s);
		return a-b;
	}
	
	String meth3(String s, int b, int d)
	
	{
		System.out.println(b+d);
		return s;
		
	}
	int meth4(int c, int k)
	{
		System.out.println(k);
		mark09 A=new mark09();
		int result = A.meth2(50, 50, 50);
		System.out.println(result);
		return k+10;
		
	}
	String meth5(int a, String L) 
	{
		System.out.println(a+a);
		mark09 B = new mark09();
		String s = B.meth3("Hi", 15, 10);
		System.out.println(s);
		return L;
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mark09 C=new mark09();
		System.out.println("Start");
		int result =C.meth4(20, 10);
		System.out.println(result);
		C.meth1();

	}

}
