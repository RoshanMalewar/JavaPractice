package controlStatement;

public class ClassDiscount
{
	void meth1(int units)
	{
		int final_price = units*100;
		if(final_price >= 1000)
		{
			
			int discount = (int) (final_price*0.1);
			//int discount = (int) (final_price*10)/100;
			
			System.out.println("The final price after discount is: "+(final_price - discount));
			System.out.println("You have saved "+discount+" rupies");
			
			
		}
		else
		{
			System.out.println("Your final bill is:  "+final_price);
		}
		
	}

	public static void main(String[] args) 
	{
		ClassDiscount t1 = new ClassDiscount();
		t1.meth1(10);

	}

}
