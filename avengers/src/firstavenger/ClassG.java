package firstavenger;

public class ClassG {
	
	public ClassG()
	{
		System.out.println("Sunday");
		ClassG aobj = new ClassG(10);
		System.out.println("Tuesday");
		String s = aobj.display("Challange Accepted");
		System.out.println(s);
	}
	
	public ClassG(int temp)
	{
		System.out.println("Saturday");
		new ClassG(10, 20);
		System.out.println("Monday");
	}
	
	String display(String s)
	{
		System.out.println("In the next statement, i'm returning a String Value");
		return s;
	}
	
	public ClassG(int data, int temp)
	{
		System.out.println("Thursday");
	}
	
	public static void main(String[] args) {
		
		ClassG aobj = new ClassG();
		System.out.println("Output Verified");
				
	}

}
