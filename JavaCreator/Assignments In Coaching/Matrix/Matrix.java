import java.io.*;
class InvalidSizeException extends Exception
{
	public InvalidSizeException(String str)
	{
		super(str);
	}
}
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
	public void set(int r,int c)throws InvalidSizeException
	{
		if(arr.length==0)
		{
			InvalidSizeException e=new InvalidSizeException("The Size Of matrix can't allow 0");
			throw e;
		}
		else
		{
			show();
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
        		System.out.println(" ");
   	 	}
	}
}