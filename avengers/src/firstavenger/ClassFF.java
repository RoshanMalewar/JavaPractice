package firstavenger;

public class ClassFF {
	
	static int a=0;
	int b=0;
	
	ClassFF()
	{
		a++;
		b++;
		System.out.println("Static Variable >>>>>>>> "+a);
		System.out.println("Instance Variable >>>>>>>>> "+b);
		System.out.println("---------------");
	}
	void display()
	{
		System.out.println("***** Accessing Static Variable *****");
		System.out.println(ClassFF.a);
		System.out.println(a);
		System.out.println(new ClassFF().a);
	}

	public static void main(String[] args) {
		
		new ClassFF();
		new ClassFF();
		new ClassFF();
		System.out.println("######################################");
		new ClassFF().display();
		// TODO Auto-generated method stub

	}

}
