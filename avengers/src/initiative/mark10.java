package initiative;

public class mark10 {
	
	int meth1()
	{
		System.out.println(10);
		return new mark10().meth2()+1;
	}
	
	int meth2() 
	{
		System.out.println(20);
		return 99;
	}

	public static void main(String[] args) {
		
		System.out.println(new mark10().meth1()-99);
		
		// TODO Auto-generated method stub

	}

}
