import java.util.*;
class Demo9
{
	public static void main(String args[])
	{
		//Console con=System.console();
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		double t,root1,root2;
		System.out.println("Enter the no. a");
		a=sc.nextInt();
		System.out.println("Enter the no. b");
		b=sc.nextInt();
		System.out.println("Enter the no. c");
		c=sc.nextInt();
		t=b*b-4*a*c;
		if(t>0)
		{
			root1 = (-b+Math.sqrt(t))/(2*a);
			root2 = (-b-Math.sqrt(t))/(2*a);
			System.out.println("First root"+root1);
			System.out.println("Second root"+root2);
		}
		else 
		{
			System.out.println("Root are imaginary");
		}
	}
}