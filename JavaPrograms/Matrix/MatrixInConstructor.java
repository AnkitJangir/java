import java.io.*;
class Matrix
{
	private int arr[][];
	public Matrix()
	{
    		this(3,3);
	}
	public Matrix(int r,int c) 
	{
    		arr=new int[r][c];
    		//read();
	}
	public Matrix(Matrix m)  
	{
    		System.out.println("Fetching array...");
    		int r,c;
		r=m.arr.length;
    		c=m.arr[0].length;
    		arr=new int [r][c];
    		/*for(int i=0;i<r;i++)
    		{
        		for(int j=0;j<c;j++)
        		{
           		 	arr[i][j]=m.arr[i][j];
        		}
    		}*/
	}
	public void read()
	{
    		int i,j,r,c;
    		r=arr.length;
    		c=arr[0].length;
    		Console con=System.console();
    		for(i=0;i<r;i++)
    		{
        		for(j=0;j<c;j++)
        		{
            			arr[i][j]=Integer.parseInt(con.readLine());
        		}
    		}
	}
	public void show()
	{
    		int i,j,r,c;
		r=arr.length;
		c=arr[0].length;
    		for(i=0;i<arr.length;i++)
    		{
        		for(j=0;j<arr[0].length;j++)
        		{
            			System.out.print(" "+arr[i][j]);
        		}
        		System.out.println("");
   	 	}
	}
}
class UseMatrixInConstructor 
{
	public static void main(String args[])
	{
		Matrix m1=new Matrix();
		System.out.println("First matrix is");
		m1.show();
		Matrix m2=new Matrix(2,2);
		System.out.println("Second matrix is");
		m2.read();
		m2.show();
		Matrix m3=new Matrix(m2);
		m3.read();
		m3.show();
		/*m1.read(3,3);
		System.out.print("Now First array is");		
		m1.show();*/
	}
}
