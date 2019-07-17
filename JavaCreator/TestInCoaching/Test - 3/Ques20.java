public class Ques20
{
	public static void main(String args[])
	{
		outer:
			for(int i=0;i<3;i++)
				inner:
					for(int j=0;j<3;j++)
					{
						if(j>1)
							break outer;
						System.out.println(j+"and"+i);
					}
	}				
}