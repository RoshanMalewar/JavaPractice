package Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClassB 
{
	void meth1()
	{
        ArrayList<ClassAB> al=new ArrayList<ClassAB>();
        
        ClassAB aobj1=new ClassAB("Kishan", 101, "Java");
        ClassAB aobj2=new ClassAB("Sujatha", 105, "AI");
        ClassAB aobj3=new ClassAB("Vijay", 102, "Python");
       
        al.add(aobj1);
        al.add(aobj2);
        al.add(aobj3);
       
        System.out.println(al);
        System.out.println("--------------------");
       
        Collections.sort(al,new ClassC());
       
        Iterator<ClassAB> i=al.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());            
        }

		
	}

	public static void main(String[] args) 
	{
		new ClassB().meth1();

	}

}
