package oopsConcepts;

public class ClassInheritance_02 extends ClassInheritance_01
{
	void meth2()
	{
		System.out.println("Class 02 method"); //Simple Inheritance
	}

	public static void main(String[] args) 
	{
		ClassInheritance_02 t1 = new ClassInheritance_02();
		t1.meth2();
		t1.meth1();
		
		System.out.println("--------------------");
		
		ClassInheritance_01 t2 = new ClassInheritance_01();
		t2.meth1();
		//t2.meth2(); C.E. 
		
		System.out.println("---------------------");
		
		//ClassInheritance_02 t3 = new ClassInheritance_01(); //C.E
		
		ClassInheritance_01 t3 = new ClassInheritance_02();
		t3.meth1();
		//t3.meth2(); C.E
		
		

	}

}
