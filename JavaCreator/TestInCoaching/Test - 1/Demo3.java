public class Demo3
{
	public static void main(String args[])
	{
		int i,j;
		outer:
			for(i=1;i<3;i++)
				inner:
					for(j=1;j<3;j++)
					{
						if(j==2)
							continue outer;
						System.out.println("Value for i="+i+"Value for j="+j);
					}
	}
}