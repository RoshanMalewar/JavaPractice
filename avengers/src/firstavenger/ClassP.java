package firstavenger;

public class ClassP {
	
	void meth1()
	{
		int a=34;
		int b=21;
		int c= a++ + ++b; //34 + 22
		System.out.println(c);
		int d= --a + --b + c--; //34 + 21 + 56
		System.out.println(d);
		int e= a + +b + +c + d--; //34 + 22 + 56 + 111
		System.out.println(e);
		int f= -a + b-- + -c -d++;
		System.out.println(f);
		int sum = a+b+c+d+e+f;
		System.out.println("Sum= "+sum);
	}
	

	public static void main(String[] args) {
		new ClassP().meth1();
		// TODO Auto-generated method stub

	}

}
