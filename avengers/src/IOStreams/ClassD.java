package IOStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassD 
{
	void fileOperations() throws Exception
	{
		System.out.println("Implementing DataStreams");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\Learning\\IOFiles\\file04.txt"));
		System.out.println("Connection Created");
		dos.writeInt(1000);
		dos.writeChar('A');
		dos.writeBoolean(true);
		dos.writeInt(2000);
		
		System.out.println("Data Entered");
		dos.close();
		System.out.println("----------------------");
		DataInputStream dis = new DataInputStream(new FileInputStream("D:\\Learning\\IOFiles\\file04.txt"));
		
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		
		System.out.println("Data Retrived");
		dis.close();
		
	}

	public static void main(String[] args) 
	{
		try 
		{
			new ClassD().fileOperations();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		

	}

}
