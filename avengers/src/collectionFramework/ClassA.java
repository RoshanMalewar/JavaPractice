package collectionFramework;

public class ClassA 
{
	String empName;
	int empId;
	String empDept;
	
	public ClassA(String empName, int empId, String empDept)
	{
		this.empName=empName;
		this.empId=empId;
		this.empDept=empDept;
		
	}
	
	//alt+Shift+s
	
	@Override
	public String toString()
	{
		return"[empName=" +empName+",empId="+empId+",empDept="+empDept+"]";
	}

}
