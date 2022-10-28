package controlStatement;

import java.util.Scanner;

public class Scanner02 {
	
	void empDetails()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter empName: ");
		String empName = sc.nextLine();
		
		System.out.println("Enter empId: ");
		int empId = sc.nextInt();
		
		System.out.println("Enter empSal: ");
		float empSal = sc.nextFloat();
		
		System.out.println("Enter empAddress: ");
		sc.nextLine();
		String empAddress = sc.nextLine();
		
		System.out.println("-----------------------");
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Salary: "+empSal);
		System.out.println("Employee Address: "+empAddress);

		sc.close();
	}

	public static void main(String[] args) {
		Scanner02 t1 = new Scanner02();
		t1.empDetails();

	}

}
