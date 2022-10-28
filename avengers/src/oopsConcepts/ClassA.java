package oopsConcepts;


public class ClassA 
{
	private String studentName;
	private int studentRollNumber;
	
	//Shift+Alt+S >>> Shortcut to generate setters and getters
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("We are calling from ClassB");
		this.studentName = studentName;
	}
	public int getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}


}



