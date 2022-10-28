package controlStatement;

public class ForLoop_Table 
{
	void meth1(int num)
	{
		for(int table = 1;table <=10;table++)
		{
			System.out.println(num+"*"+table+"="+(num*table));
		}
	}
	
	public static void main(String[] args) 
	{
		ForLoop_Table t1 = new ForLoop_Table();
		t1.meth1(5);
	}

}
