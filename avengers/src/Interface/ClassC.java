package Interface;

import java.util.Comparator;

public class ClassC  implements Comparator<ClassAB>
{
	@Override
    public int compare(ClassAB o1, ClassAB o2)
    {
        //return o1.getEmpId()-o2.getEmpId();
        //return o1.getEmpDept().compareTo(o2.getEmpDept());
        return o1.getEmpName().compareTo(o2.getEmpName());
    }        	

}
