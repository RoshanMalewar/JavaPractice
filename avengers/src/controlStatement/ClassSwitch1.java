package controlStatement;

public class ClassSwitch1 
{
	void meth1()
	{
		System.out.println("Implementing Switch Case");
		System.out.println("----------------------------------");
		int a = 50;
		final int x = 50;
		byte b = 65;
		switch(b-35)
		{
		
		//System.out.println("Inside switch case as individual statement"); //C.E. Individual statemenst are not allowed in switch case
		
		case 10:
			System.out.println("Case 10 Executed");
			ClassSwitch1 t2 = new ClassSwitch1();
			int i=45;
			if (i<50)
			{
				System.out.println("If block executed");
				t2.meth2();
			}
			else
			{
				System.out.println("Else block executed");
				t2.meth3();
			}
			
			break;
		case 'A':
			System.out.println("Case 65 executed");
			System.out.println("Int and Char both are compatible");
			break;
		case 300-270:
			System.out.println("Case 30 Executed");
			System.out.println("Expressions are allowed in Switch");
			break;
		case 40:
			System.out.println("Case 40 Executed");
			//x++; // Final variable are constant
			//++x;
			break;
		case x:  //Every case LABLE's should be compile time constant
			System.out.println("Case 50 Executed");
			break;
		default:
			System.out.println("Invalid Input");
			System.out.println("Default case will be executed only if no case label matched");
			break;
		}
		
		System.out.println("----------------------------------");
		System.out.println("Compiler came out of switch case");
	}
	
	void meth2()
	{
		System.out.println("Meth2 called");
		System.out.println("Java is Awesome");
	}
	
	void meth3()
	{
		System.out.println("Meth3 called");
		System.out.println("Inside switch case labels we can write any VALID java statements");
	}
	
	public static void main(String[] args) 
	{
		ClassSwitch1 t1 = new ClassSwitch1();
		t1.meth1();
		
		

	}

}
