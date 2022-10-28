package oopsConcepts;

public class Inheritance_03 extends Inheritance_02
{
	void meth3()
	{
		System.out.println("Class 03 Method");   //Multilevel Inheritance
	}

	public static void main(String[] args) 
	{
		Inheritance_03 t1=new Inheritance_03();
		t1.meth1();
		t1.meth2();
		t1.meth3();


	}

}
