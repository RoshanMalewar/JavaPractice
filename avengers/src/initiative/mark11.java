package initiative;

public class mark11 {
	
	String meth1(int a, int b) //called by meth4
	{
		System.out.println(10);
		System.out.println((54+a)-b);
		int value =new mark11().meth5(); //Creating object
		System.out.println(value);
		return "Java";
	}
	int meth2(int a) //called by meth5
	{
		System.out.println(75);
		int b=5;
		System.out.println(b-a);
		return(5*5)-b;
	}
	void meth3() //Called by main method
	{
		System.out.println("Start");
		System.out.println(new mark11().meth4());
		System.out.println(40);
	}
	String meth4() //called by meth3
	{
		System.out.println("Today is monday");
		return new mark11().meth1(4, 8); //Creating object
	}
	int meth5() //Called by meth1
	{
		mark11 A = new mark11(); //Creating object
		System.out.println(99);
		return A.meth2(5);
	}
	

	public static void main(String[] args) {
		mark11 B = new mark11(); //Creating object
		B.meth3();
		
		// TODO Auto-generated method stub

	}

}
