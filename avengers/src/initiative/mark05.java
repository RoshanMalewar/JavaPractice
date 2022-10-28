/**
 * 
 */
package initiative;

/**
 * @author Roshan
 *
 */
public class mark05 {

	void meth01(int a, int b) {
		System.out.println("meth1() is called");
		System.out.println("a value: " +a);
		System.out.println("b value: " +b);
		System.out.println(a+b);


	}
	
	void meth02(int a, int b, int c) {
		System.out.println("meth2() is called");
		System.out.println("a value: "+a);
		System.out.println("b value: "+b);
		System.out.println("c value: "+c);
		System.out.println((a+b)-c);

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mark05 A=new mark05();
		A.meth01(99, 1);
		System.out.println("==========================");
		A.meth02(10, 20, 30);

	}

}
