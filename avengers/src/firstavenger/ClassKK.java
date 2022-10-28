package firstavenger;

public class ClassKK 
{
	void meth1()
	{
		System.out.println("implementing Auto-Boxing");
		int i =10;
		Integer ival1 = Integer.valueOf(i);
		Integer ival2 = Integer.valueOf(100);
		Integer ival3 = Integer.valueOf("99");
		
		System.out.println("Integer premitive datatype value: "+i);
		System.out.println("Integer WCO value: "+ival1);
		System.out.println("Integer WCO value: "+ival2);
		System.out.println("Integer WCO value: "+ival3);
		
		System.out.println("--------------------------");
		
		byte b =50;
		Byte bval1=Byte.valueOf(b);
		Byte bval2 = Byte.valueOf((byte)i);
		System.out.println("Byte premitive datatype value: "+b);
		System.out.println("Byte WCO value: "+bval1);
		System.out.println("Byte WCO value: "+bval2);

		
		System.out.println("--------------------------");
		
		char c = 'A';
		Character cval1 = Character.valueOf(c);
		System.out.println("Character PDT value is: "+c);
		System.out.println("Character WCO Value is: "+cval1);
		
	}

	
	public static void main(String[] args) 
	{
		ClassKK t1=new ClassKK();
		t1.meth1();

	}

}
