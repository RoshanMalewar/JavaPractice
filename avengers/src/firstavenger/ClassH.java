package firstavenger;

public class ClassH {
	
	String studentName;
	int studentId;
	String studentDept;
	
	ClassH(String name, int id, String dept)
	{
		studentName=name;
		studentId=id;
		studentDept=dept;
	}

	public static void main(String[] args) {
		ClassH aobj1=new ClassH("Manashri", 16, "Btech");
		ClassH aobj2=new ClassH("Roshan", 7, "Mtech");
		ClassH aobj3=new ClassH("Maau", 167, "MBA");
		
		System.out.println(aobj1.studentName+ " "+aobj1.studentId+ " "+aobj1.studentDept);
		System.out.println(aobj2.studentName+ " "+aobj2.studentId+ " "+aobj2.studentDept);
		System.out.println(aobj3.studentName+ " "+aobj3.studentId+ " "+aobj3.studentDept);
		
		// TODO Auto-generated method stub

	}

}
