import java.io.*;
class Demo5
{
	public static void main(String args[])
	{
		Console con=System.console();
		int arr[][]=new int[3][3];
		int i,j,sum=0;
		System.out.print("Enter the values");
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(con.readLine());
			}
		}
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				sum+=arr[i][j];	
			}
		}
		System.out.print("sum is"+sum);
	}
}
		