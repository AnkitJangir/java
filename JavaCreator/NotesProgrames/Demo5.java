import java.io.*;
class Demo
{
	private int x=24;
	private boolean y=true;
	private int i;
	private int arr[]=new int[5];
	{
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100);
		}
	}
	public void show()
	{
		System.out.println("X="+x+"Y="+y);
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Array is="+arr[i]);
		}
	}
	public static void main(String args[])
	{
		Demo d1=new Demo();
		Demo d2=new Demo();
		d1.show();
		d2.show();
	}
}
