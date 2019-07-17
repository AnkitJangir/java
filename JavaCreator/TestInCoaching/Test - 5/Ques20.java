public class Ques20
{
	public static void main(String args[])
	{
		int y,count=0;
		for(int x=3;x<6;x++)
		{
			try
			{
				switch(x)
				{
					case 3:
						count++;
					case 4:
						count++;
					case 7:
						count++;
					case 9:
					{
						y=7/(x-4);
						count+=10;
					}
				}
			}
			catch(Exception ex)
			{
				count++;
			}
			System.out.println(count);
		}
	}
}