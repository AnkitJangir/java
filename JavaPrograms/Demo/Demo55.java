import java.io.*;
class Demo
{

	public static void main(String args[])
	{
		Console con=System.console();
		int a[]=new int[4];
		int i;
		System.out.println("Enter the values of array");
		for(i=0;i<a.length;i++)
		{
			 a[i]=Integer.parseInt(con.readLine());
		}
		for(i=0;i<a.length;i++)
		{
			a[i+1] = a[i];
		a[i]>>=a[i];}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}	
	}
}		
					