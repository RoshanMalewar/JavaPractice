package Interface;

public class ClassAB 
{
    private String empName;
    private int empId;
    private String empDept;
   
    public ClassAB(String empName, int empId, String empDept)
    {
        this.empName = empName;
        this.empId = empId;
        this.empDept = empDept;
    }
    public String getEmpName()
    {
        return empName;
    }
    public int getEmpId()
    {
        return empId;
    }
    public String getEmpDept()
    {
        return empDept;
    }
    @Override
    public String toString()
    {
        return "ClassAB [empName=" + empName + ", empId=" + empId + ", empDept=" + empDept + "]";
    }    


}
