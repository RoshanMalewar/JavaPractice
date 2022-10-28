package firstavenger;

public class AddAmount {
	int amount = 500;
	
	AddAmount()
	{
		System.out.println("The account balance is: "+amount);
	}
	
	AddAmount(int a)
	{
		System.out.println("The Account balance after adding is: "+(a+amount));
	}

	public static void main(String[] args) {
		
		new AddAmount();
		new AddAmount(500);
		// TODO Auto-generated method stub

	}

}
