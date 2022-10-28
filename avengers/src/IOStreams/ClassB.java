package IOStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ClassB 
{
	void fileOperations1() throws Exception
	{
		System.out.println("Reading the data by using Character Streams");
		FileReader fr = new FileReader("D:\\Learning\\IOFiles\\file01.txt");
		System.out.println("Connection created");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("Data Retrived");
		fr.close();
	}
	
	void fileOperations2() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Data Writing");
		FileWriter fw = new FileWriter("D:\\Learning\\IOFiles\\file05.txt",true);
		System.out.println("Connection created");
		System.out.println("Please say how do you feel about java?");
		String data = sc.nextLine();
		fw.write(data);
		System.out.println("Data Entered");
		sc.close();
		fw.close();
		
	}
	
	void fileOperations3() throws Exception
	{
		FileReader fr = new FileReader("D:\\Learning\\IOFiles\\11.png");
		FileWriter fw = new FileWriter("D:\\Learning\\IOFiles\\112.png");
		System.out.println("Connection created");
		int i;
		while((i=fr.read())!=-1)
		{
			fw.write(i);
		}
		System.out.println("Data Copied");
		fr.close();
		fw.close();
	}
	

	public static void main(String[] args) throws Exception 
	{
		ClassB aobj = new ClassB();
		//aobj.fileOperations1();
		//aobj.fileOperations2();
		aobj.fileOperations3();
		
		

	}

}
