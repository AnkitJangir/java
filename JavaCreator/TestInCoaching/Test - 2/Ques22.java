public class Ques22
{
	public static void main(String args[])
	{
		int arr[]=new int []{1,2,3,4};
		outer:for(int i=0;i<arr.length;i++)
		{
			inner:for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
					continue outer;
				System.out.println(i+" "+j);
			}
		}
	}
}
