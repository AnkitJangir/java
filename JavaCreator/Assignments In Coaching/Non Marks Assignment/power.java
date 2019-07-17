class A
{
	public static void main(String args[])
	{
		int a=2,b=5;
		int c=a;
		for(int i=1;i<b;i++)
		{
			if(i==1)
			{
				a=a*a;
			}
			else
			{
				a=a*c;
			}
		}
		System.out.println(a);
	}
}