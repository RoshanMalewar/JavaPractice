package controlStatement;

public class ClassBonus 
{
	void meth1(int salary, int years)
	{
		if(years > 5)
		{
			int bonus = (int) (salary * 0.5);
			System.out.println("You are eligible for bonus of "+bonus);
			System.out.println("The total hiked salary is "+(salary+bonus));
		}
	}

	public static void main(String[] args) 
	{
		ClassBonus t1 = new ClassBonus();
		t1.meth1(100000, 6);

	}

}
