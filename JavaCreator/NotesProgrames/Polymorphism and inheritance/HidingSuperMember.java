/**
 * @(#)HidingSupermember.java
 *
 *
 * @author Ankit Jangir
 * @version 1.00 2016/12/31
 */


public class HidingSuperMember 
{
	int x;
	public void set(int a)
	{
		x=a;
	}
	public void show()
	{
		System.out.println("X:"+x);
	}
}
class Two extends HidingSuperMember
{
	int x;
 	void set(int a,int b)
	{
		super.x=a;
		x=b;
	}
	public void show()
	{
		super.show();
		System.out.println("Y:"+x);
	}
	public static void main(String args[])
	{
		Two t=new Two();
		t.set(3,4);
		t.show();
	}
	
}