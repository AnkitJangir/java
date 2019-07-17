import java.io.*;
class VerticalHistogram
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
			for(i=max;i>=0;i--)
			{
				for(j=0;j<n;j++)
				{
					if(i<a[j])
					{
						System.out.print("* ");

					}
					else
					{
						System.out.print("  ");

					}
				}	
			System.out.println(" ");
			}
	}
}