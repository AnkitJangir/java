import java.io.*;
import java.util.Scanner;
class Demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Console con=System.console();
		int a,b;
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		//a=Integer.parseInt(con.readLine());
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		//b=Integer.parseInt(con.readLine());
		try
		{
			System.out.println("Try block entered");
			System.out.println(a/b);
			System.out.println("ending try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("U can't devide by zero");
		}
		finally
		{
			System.out.println("Bye");
		}
		System.out.println("C U again");
	}
}
