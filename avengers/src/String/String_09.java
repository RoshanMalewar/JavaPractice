package String;

public class String_09 
{
	void meth1()
	{
		StringBuffer sb=new StringBuffer();
		System.out.println("Capacity(): "+sb.capacity());
		sb.append("abcdefghijklmnop");
		System.out.println("Capacity(): "+sb.capacity());
		System.out.println("Length(): "+sb.length());
		sb.append("qr");
		System.out.println("sb: "+sb);
		//((CurrentCapacity+1)*2) >> Formula to increase capacity
		System.out.println("Capacity(): "+sb.capacity());
		System.out.println("Length(): "+sb.length());
		System.out.println("-----------------------------------------");
		
		System.out.println("charAt(): "+sb.charAt(sb.length()-1));
		System.out.println("charAt(): "+sb.charAt(sb.length()-2));
		System.out.println("sb: "+sb);
		
		sb.setCharAt(0, 'A');
		System.out.println("sb: "+sb);
		System.out.println("delete(): "+sb.delete(0, 2));
		System.out.println("reverse(): "+sb.reverse());
		System.out.println("sb: "+sb);
	}

	public static void main(String[] args) 
	{
		new String_09().meth1();
		// TODO Auto-generated method stub

	}

}
