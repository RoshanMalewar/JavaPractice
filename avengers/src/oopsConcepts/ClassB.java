package oopsConcepts;

import java.util.Scanner;

import java.util.Scanner;

public class ClassB 
{
	void meth1()
	{
		ClassA t1=new ClassA();		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter your name: ");
		//t1.studentName = sc.next(); //Can not access private methods
		t1.setStudentName(sc.next());
		
		System.out.println("Enter Roll Number: ");
		//t1.studentRollNumber = sc.nextInt(); //Can not access private methods
		t1.setStudentRollNumber(sc.nextInt());
		
		//System.out.println("Student Name: "+t1.StudentName());
		System.out.println("Student Name: "+t1.getStudentName());
		
		//System.out.println("Student Roll No: "+t1.StudentRollNumber());
		System.out.println("Student Roll No: "+t1.getStudentRollNumber());
	}

	public static void main(String[] args) 
	{
		new ClassB().meth1();

	}

}
