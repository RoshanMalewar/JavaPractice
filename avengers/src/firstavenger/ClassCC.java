package firstavenger;

public class ClassCC {

	static int x = 10;
	static int y = 10;
	
	public static void main(String[] args) {
		ClassCC t1=new ClassCC();
		ClassCC t2=new ClassCC();
		
		t1.x=20;
		t1.y=20;
		System.out.print(x+" ");
		System.out.println(t2.x);
		System.out.println("------------------");
		System.out.println(t1.y+" ");
		System.out.println(t2.y);
		// TODO Auto-generated method stub

	}

}
