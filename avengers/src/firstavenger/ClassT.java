package firstavenger;

public class ClassT 
{
	void eligibility(int persons)
	{
		if(persons>=2 && persons<=4)
		{
			System.out.println("We can travel togather");
		}
		else
		{
			System.out.println("We can NOT travel togather");
		}
	}
	void loanEligibility(int income)
	{
		if(income >= 1000000 && income <= 500000)
		{
			System.out.println("You are eligible for Loan");
		}
		else
		{
			System.out.println("You are NOT eligible for Loan");
		}
	}

	public static void main(String[] args) 
	{
		ClassT t1=new ClassT();
		t1.eligibility(5);
		System.out.println("-------------------------");
		t1.loanEligibility(10000);
		// TODO Auto-generated method stub

	}

}
