class Demo
{
	public static void main(String args[])
	{
		char ch=65;
		short s=65;
		s=(short)ch;
		ch=(char)s;
		System.out.println(ch);
		System.out.println(s);
		System.out.println();
		boolean checked=true,passed=false;
		if(passed==true)
		{
			System.out.println("AA");
		}
		if(passed)
		{
			System.out.println("AB");
		}
		int a=2;
		a=a+2;
		System.out.println(a);
	}
}