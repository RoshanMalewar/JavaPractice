/**
 * 
 */
package initiative;

/**
 * @author Roshan
 *
 */
public class mark06 {
	
	void meth1(int a, int b) //Called by meth2()
	{
		mark06 A = new mark06();
		System.out.println(a-1);
		System.out.println(b);
		A.meth4(10, 2, 2);
	}
	
	void meth2(int x) //Called by meth3()
	{
		mark06 B=new mark06();
		System.out.println(x);
		B.meth1(10, 10);
		System.out.println(x+9);
		
	}
	
	void meth3(int x, int y) //Called by main()
	{
		System.out.println(x*y);
		mark06 C=new mark06();
		System.out.println(y);
		C.meth2(1);
	}
	void meth4(int a, int b, int c)  //Called by Meth1()
	{
		System.out.println(a+b);
		System.out.println(a/c);
		System.out.println(a-b);
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mark06 D = new mark06();
		System.out.println("We are in meth3() ");
		D.meth3(5, 2);

	}

}
