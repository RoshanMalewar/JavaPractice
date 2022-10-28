package initiative;

public class mark03 {
	
	void meth1() {
		mark03 A =new mark03();//Creating a Object
		A.meth5();//Calling Method
		int a =10;
		System.out.println(10);
		System.out.println(54+a);
		
	}
	void meth2() {
		
		int a =20;
		System.out.println(78-a);
	}
	void meth3() {
		int a = 30;
		mark03 B=new mark03(); //Creating a Object
		System.out.println(89+1);
		B.meth1();//Calling Method
		System.out.println(10);
	}
	
	void meth4() {
		int a =10;
		System.out.println(89);
		System.out.println(85);
		System.out.println(44);
	}
	void meth5() //Meth1
	{
		System.out.println(77);
		mark03 C= new mark03();//Creating a Object
		C.meth2();//Calling Method
		System.out.println(99);
	}

	public static void main(String[] args) {
		System.out.println("Start");
		mark03 D=new mark03(); //Creating a Object
		D.meth3();//Calling Method
		System.out.println("End");

	}

}
