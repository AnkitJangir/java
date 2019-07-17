import java.util.*;
class Demo1
{
	public static void main(String args[])
	{
		Vector<Integer> v=new Vector<Integer>(3,2);
		System.out.println("Intial size is : "+v.size());
		System.out.println("Intial Capacity is : "+v.capacity());
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("Capacity after four addtion is : "+v.capacity());
		v.addElement(5);
		System.out.println("Currnt  Capacity is : "+v.capacity());
		System.out.println("First Element : "+v.firstElement());
		System.out.println("Last Element : "+v.lastElement());
		if(v.contains(3))
		{
			System.out.println("Vector Contains 3.");
		}
		Enumeration<Integer> vEnum=v.elements();
		System.out.println("Elements in Vector :");
		while(vEnum.hasMoreElements())
		{
			System.out.println(vEnum.nextElement()+" ");
		}
		System.out.println();
	}
}