package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassA 
{
	void fileOperations1() throws Exception
	{
		System.out.println("Reading the data from file");
		FileInputStream fis = new FileInputStream("D:\\Learning\\IOFiles\\file01.txt");
		System.out.println("Connection created");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("Data Retrived");
		fis.close();
	}
	
	void fileOperations2() throws Exception
	{
		System.out.println("Writing data into a file");
		FileOutputStream fos = new FileOutputStream("D:\\Learning\\IOFiles\\file02.txt");
		System.out.println("Connection Created");
		String data = "Java Is Awesome,So I love it";
		byte arr[] = data.getBytes();
		fos.write(arr);
		System.out.println("Data Written");
		fos.close();
	}
	
	void fileOperations3() throws Exception
	{
		System.out.println("Copying data from one file to another file");
		FileInputStream fis = new FileInputStream("D:\\Learning\\IOFiles\\file02.txt");
		FileOutputStream fos = new FileOutputStream("D:\\Learning\\IOFiles\\file03.txt");
		System.out.println("Connection Created");
		int i;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		System.out.println("Data Copied");
		fis.close();
		fos.close();
	}

	public static void main(String[] args) throws Exception
	{
		ClassA aobj = new ClassA();
		//aobj.fileOperations1();
		//aobj.fileOperations2();
		aobj.fileOperations3();
	

	}

}
