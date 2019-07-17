import java.io.*;
class Exception
{
	public static void main(String args[])
	{
		int i,a,b,n;
		Console con=System.console();
		System.out.println("Enter a no. till the loop execute");
		n=Integer.parseInt(con.readLine());
		for(i=1;i<=n;i++)
		{	
			System.out.println("Enter the value of a");
			a=Integer.parseInt(con.readLine());
			System.out.println("Enter the value of b");
			b=Integer.parseInt(con.readLine());
			try
			{
				System.out.println("Try block entered");
				System.out.println(a/b);
				System.out.println("Try block closed");
			}
			catch(ArithmeticException e)
			{
				System.out.println("We can't devide by Zero");
			}
			finally
			{
				System.out.println("Try a number again");
			}
		}
		System.out.println("C U again");
	}
}