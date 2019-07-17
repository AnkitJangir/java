import java.util.*;
class A
{
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				c[i][j]+=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				System.out.println(c[i][j]);
			}
		}
		
	}
}