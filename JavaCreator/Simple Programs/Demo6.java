import java.io.*;
public class Demo6
{
	public static void main(String args[])
	{
		Console con=System.console();
		int a,b,c;
		System.out.println("Enter the no.");
		a=Integer.parseInt(con.readLine());
		System.out.println("Enter the second no.");
		b=Integer.parseInt(con.readLine());
		System.out.println(c=a+b);
		
	}
}