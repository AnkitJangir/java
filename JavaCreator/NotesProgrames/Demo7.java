import java.io.*;
class Demo7
{
	public static void main(String args[])
	{
		Console con=System.console();
		int arr[][][]=new int [2][4][3];
		arr[1][0][2]=90;
		arr[0][3][1]=54;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the values for arr.length");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the values for arr[i].length");
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter the values for arr[i][j].length");
					arr[i][j][k]=Integer.parseInt(con.readLine());
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println(arr[i][j][k]);			}
			}
		}
	}
}