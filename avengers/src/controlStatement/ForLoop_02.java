package controlStatement;

public class ForLoop_02 {
	
	void display()
	{
		int a =10;
		for(int k = (a++)+(++a)+(++a);k>10;k++)
		{
			System.out.println(k);
			break;
		}
	}

	public static void main(String[] args) {
		
		ForLoop_02 t1 = new ForLoop_02();
		t1.display();

	}

}
