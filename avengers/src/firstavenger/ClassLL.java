package firstavenger;

public class ClassLL 
{
	void meth1()
	{
		Integer ival1 = new Integer(10);
		Integer ival2 = Integer.valueOf(100);
		Integer ival3 = Integer.valueOf(500);
		
		int i1 = ival1;
		int i2 = ival2;
		int i3 = ival3.intValue();
		
		System.out.println("Integer WCO: "+ival1);
		System.out.println("Integer WCO: "+ival2);
		System.out.println("Integer WCO: "+ival3);
		System.out.println();
		
		System.out.println("Integer PDT: "+i1);
		System.out.println("Integer PDT: "+i2);
		System.out.println("Integer PDT: "+i3);
		
		System.out.println("---------------------");
		
		Boolean bval1 = Boolean.valueOf("Java is awesome"); //Default value of Boolean is "False", if the value is specified as True then it will print True otherwise it will print false.
		boolean b=bval1.booleanValue();
		
		System.out.println("Boolean WCO: "+bval1);
		System.out.println("boolean PDT: "+b);
		
		
	}

	public static void main(String[] args) {
		
		ClassLL t1 =new ClassLL();
		t1.meth1();
		

	}

}
