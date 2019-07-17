import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		int  arr[]={20,30,40,50};
		Vector v=new Vector();
		for(int i=0;i<arr.length;i++)
			v.add(arr[i]);
		for(Object o:v)
			System.out.println((int)o);
		for(int i=0;i<v.size();i++)
		{
			System.out.println((int)v.get(i));
		}
		System.out.println(v.capacity());
		System.out.println(v.size());
		
	}
}