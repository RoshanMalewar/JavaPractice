package firstavenger;

public class ClassV
{
	static String insName = "Naresh i Tech";
	String stuName;
	int stuId;
	
	ClassV(String name, int id)
	{
		stuName=name;
		stuId=id;
	}

	public static void main(String[] args) 
	{
		ClassV t1=new ClassV("Manashri", 100);
		ClassV t2=new ClassV("Maau", 101);
		ClassV t3=new ClassV("Roshan", 102);
		
		System.out.println("InsName : "+insName+ "Student Name : "+t1.stuName+ " Student Id : "+t1.stuId);
		System.out.println("InsName : "+insName+ "Student Name : "+t2.stuName+ " Student Id : "+t2.stuId);
		System.out.println("InsName : "+insName+ "Student Name : "+t3.stuName+ " Student Id : "+t3.stuId);
		
		// TODO Auto-generated method stub

	}

}
