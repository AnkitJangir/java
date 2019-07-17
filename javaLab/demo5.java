import java.util.*;
class A
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("The no is even");
		}
		System.out.println(a);
	}
}