class Demo15
{
	public static void main(String args[])
	{
		int a=20;
		final int b=10;
		int c=20;
		switch(c)
		{
			case 3:
				System.out.println("3");
				break;
			case b:
				System.out.println("A");
				break;
			case 20:
				System.out.println("-1");
				break;
		}
	}
}