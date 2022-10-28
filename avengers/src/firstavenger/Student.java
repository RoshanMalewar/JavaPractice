package firstavenger;

public class Student {
	
	Student()
	{
		System.out.println("Unknown");
	}
	
	Student(String s)
	{
		System.out.println("The Student name: "+s);
	}
	
	public static void main(String[] args) 
	{
		new Student();
		new Student("Manashri");
		// TODO Auto-generated method stub

	}

}
