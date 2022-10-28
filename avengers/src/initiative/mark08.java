package initiative;

public class mark08 {
	
	public String meth1(int a, String s) //called by main()
	{
		System.out.println(a+10);
		int i = new mark08().meth2(30, "Hello", 20);
		System.out.println(i+i);//10+10
		return "Java is Awesome";
		
	}
	
	int meth2(int a, String s,int b) //Called by meth1() a=30 s="Hello" b=20
	{
		System.out.println(a+b);
		System.out.println(s);
		return a-b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		String data=new mark08().meth1(10, "Hi");
		System.out.println(data);
		System.out.println("End");
		
		

	}

}
