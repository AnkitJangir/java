public class Demo10
{
	public static void main(String argv[])
	{
		int Output;
		boolean b1=true;
		if(b1==true&&((Output+=10)==20))
		{
			System.out.println("We are equal"+Output);
		}
		else
		{
			System.out.println("Not equal!"+Output);
		}
	}
}
