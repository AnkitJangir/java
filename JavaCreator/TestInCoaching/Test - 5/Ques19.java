public class Ques19
{
	public static void main(String args[])
	{
		int x=3;
		for(int i=0;i<3;i++)
		{
			if(i==1)
			{
				x=x++;
			}
			if(i%2==0&&x%2==0)
			{
				System.out.println(".");
			}
			if(i%2==0&&x%2==0)
			{
				System.out.println("-");
			}
			if(i==2^x==4)
			{
				System.out.println(",");
			}
			System.out.println("<");
		}
	}
}