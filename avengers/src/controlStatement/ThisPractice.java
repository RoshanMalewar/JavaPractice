package controlStatement;

public class ThisPractice 
{
	String name;
	
	ThisPractice()
	{
		this("Abdul Kalam Azad");
		this.display();
	}
	ThisPractice(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println("Person Name is : "+name);
	}

	public static void main(String[] args) 
	{
		ThisPractice p1 = new ThisPractice();

	}

}
