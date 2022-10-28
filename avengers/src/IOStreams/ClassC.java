package IOStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClassC 
{
	void fileOperations1() throws Exception
	{
		System.out.println("Reading the data using buffered byte streams");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Learning\\IOFiles\\file05.txt"));
		System.out.println("Connection Created");
		int i;
		while((i=bis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
	}

	public static void main(String[] args) throws Exception 
	{
		ClassC aobj = new ClassC();
		aobj.fileOperations1();

	}

}
