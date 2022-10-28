package exceptionHandling;

import java.io.FileInputStream;

public class throwKeyword_01 
{
	int avl_amt = 10000;
	void meth1(int wd_amt)
	{
		if(avl_amt<wd_amt)
		{
			throw new NullPointerException("Insufficient Funds");
		}
		else
		{
			System.out.println("Transaction Success");
		}
	}
	
	void meth2() throws Exception
	{
		System.err.println("-----------------Meth2()----------------");
		FileInputStream fis = new FileInputStream("D:\\Learning\\IOFiles\\file01.txt");
		System.out.println("Conncetion Created");
		
	}

	public static void main(String[] args) throws Exception
	{
		throwKeyword_01 t1 = new throwKeyword_01();
		t1.meth1(9000);
		t1.meth2();

	}

}
