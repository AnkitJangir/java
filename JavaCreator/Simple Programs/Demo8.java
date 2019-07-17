
import java.util.*;
class Demo8
{
	public static void main(String args[])
	{
		int a,b,c;
		//Console con=System.console();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a");
		//a=Integer.parseInt(con.readLine());
		a=sc.nextInt();
		System.out.println("Enter the b");
		//b=Integer.parseInt(con.readLine());
		b=sc.nextInt();
		System.out.println("Enter the c");
		//c=Integer.parseInt(con.readLine());
		c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println(a+"is largest");
		}
		else if(b>a&&b>c)
		{
			System.out.println(b+"is largest");
		}
		else
		{
			System.out.println(c+"is largest");
		}
	}
}