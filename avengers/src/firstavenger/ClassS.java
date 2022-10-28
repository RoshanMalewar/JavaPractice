package firstavenger;

public class ClassS 
{
	void examEligibility(int age) //21 to 35
	{
		System.out.println("The person's age is: "+age);
		if(age>=21 && age<=35)
		{
			System.out.println("The candidate is eligible");
		}
		else
		{
			System.out.println("The candidate is NOT eligible");
		}
	}
	void examEligibility1(int age)
	{
		System.out.println("The person's age is: "+age);
		if(age>=21 || age<=35)
		{
			System.out.println("The candidate is eligible");
		}
		else
		{
			System.out.println("The candidate is NOT eligible");
		}
	}
	void meth1(int i)
	{
		if(!(i<50))
		{
			System.out.println("If Block is executed");
		
		}
		else
		{
			System.out.println("Else Block executed");
		}
	}

	public static void main(String[] args) 
	{
		ClassS t1=new ClassS();
		t1.examEligibility(26);
		System.out.println("------------------------");
		t1.examEligibility1(50);
		System.out.println("------------------------");
		t1.meth1(51);
		// TODO Auto-generated method stub

	}

}
