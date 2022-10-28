package initiative;

public class mark04 {
	
	void meth01() {
		System.out.println("Hi");
	}
void meth02() {
	System.out.println("Hello");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mark04 A;
		new mark04().meth01();
		new mark04().meth02();
		
		System.out.println("+++++++++++++++++++");
		mark04 B= new mark04();
		B.meth01();
		B.meth02();

	}

}
