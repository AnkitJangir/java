import java.io.*;
class HorizontalHistogram
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int n,i,j,max=0;
		Console con=System.console();
		System.out.println("Enter the no of elements in an array");
		n=Integer.parseInt(con.readLine());
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(con.readLine());
			if(a[i]>max)
			{
				max=a[i];
			}
		}	
		for(i=0;i<n;i++)
		{
			for(j=max;j>=0;j--)
			{
				if(j<a[i])
				{
					System.out.print("* ");
				}
				/*else
				{
					System.out.print("  ");
				}*/
			}	
			System.out.println();
		}
	}
}