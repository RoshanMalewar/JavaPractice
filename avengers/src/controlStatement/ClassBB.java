package controlStatement;

public class ClassBB {
	
	void meth1 (int length, int breadth)
	{
		if(length == breadth)
		{
			System.out.println("It's a square");
		}
		else
		{
			System.out.println("It's a Reactangle");
		}
	}

	public static void main(String[] args) 
	{
		ClassBB t1 = new ClassBB();
		t1.meth1(40, 30);


	}

}
