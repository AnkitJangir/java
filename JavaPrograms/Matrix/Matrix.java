import java.io.*;
class Matrix
{
	private int a[][]=new int [3][3];
	public void read()
	{
		int i,j;
		Console con=System.console();
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=Integer.parseInt(con.readLine());
			}
		}
	}
	public void show()
	{
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
class UseMatrix 
{
	public static void main(String args[])
	{
		Matrix m1=new Matrix();
		System.out.print("Enter a value");
		m1.read();
		System.out.print("First matrix is");
		m1.show();
		Matrix m2=new Matrix();
		System.out.print("enter the more values");
		m2.read();
		System.out.print("Second Matrix is");
		m2.show();
	}
}

		