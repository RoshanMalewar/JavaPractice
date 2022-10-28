package initiative;

public class mark02 {
	
	public void meth01() {
		System.out.println(10);
		mark02 AA= new mark02();//Creating a object
		AA.meth02();//Calling a method
	
		System.out.println("Hi");
	}
	
	public void meth02() {
		System.out.println(20);
		mark02 BB= new mark02();//Creating a object
		BB.meth03();//Calling a method
		System.out.println("Hello");
	}
	
	public void meth03() {
		System.out.println(30);
		System.out.println("Welcome");
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("You are in Main Method");
		mark02 CC=new mark02(); //Creating a object
		CC.meth01(); //Calling a method
		System.out.println("Main method is executed");
		

	}

}
