import java.util.*;
import java.io.*;
class SumOfValue
{
	public static void main(String args[])
	{
		Console con=System.console();
		int no,sum=0;
		String str=null;
		System.out.println("Enter the values");
		str=con.readLine();
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens())
		{
			no=Integer.parseInt(st.nextToken());
			sum+=no;
		}
		System.out.println("Total is : "+sum);
	}
}