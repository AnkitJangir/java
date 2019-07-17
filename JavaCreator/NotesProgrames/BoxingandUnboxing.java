import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		String arr[]={"ios","R","hadoop"};
		Vector<String> v=new Vector<String>();
		for(int i=0;i<arr.length;i++)
		{
			v.add(arr[i]);	
		}
		System.out.println(v.capacity());
		System.out.println(v.size());
		for(int i=0;i<v.size();i++)
		{
			System.out.println((String)v.get(i));
			
		}
	
	}
}
class Demo55
{
	public static void main(String args[])
	{
		int no=25;
		Integer a=no;
		System.out.println(a);
		Integer obj=new Integer(34);
		int sum=0;
		no=obj;
		sum+=obj;
		Integer b=new Integer(20);
		if(a==b)
			System.out.println("Yes");
	}
}