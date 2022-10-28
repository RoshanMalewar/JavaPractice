package IOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClassG 
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Implementing Object Streams");
		
		ClassE aobj1 = new ClassE();
		ClassF bobj1 = new ClassF();
		
		System.out.println(aobj1.a+" "+aobj1.b);
		System.out.println(bobj1.x+" "+bobj1.y);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Learning\\IOFiles\\data.ser"));
		System.out.println("Connection Created");
		
		oos.writeObject(aobj1);
		oos.writeObject(bobj1);
		
		oos.close();
		System.out.println("Serialization Completed");
		
		System.out.println("De-Serialization Started");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Learning\\IOFiles\\data.ser")); 
		
		ClassE aobj2 = new ClassE();
		ClassF bobj2 = new ClassF();
		
		System.out.println(aobj2.a+" "+aobj2.b);
		System.out.println(bobj2.x+" "+bobj2.y);
		
	}

}
