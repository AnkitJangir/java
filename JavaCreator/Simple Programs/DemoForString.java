class Demo2
{
	public static void main(String args[])
	{
		String s1="java";
		String s2="Java";
		if(s1==s2)
			System.out.println("true");
		else
			System.out.println("false");
		if(s1.equals(s2))
		{
			System.out.println("true1");
		}
		if(s1.equalsIgnoreCase(s2))
			System.out.println("true");
		char ch='8';
		System.out.println(ch);
		ch=Character.toLowerCase(ch);
		System.out.println(ch);
		ch+=32;
		System.out.println(ch);
		StringBuffer s3=new StringBuffer ("new java text");
		s3.replace(4,8,"Oracle");
		System.out.println(s3);
	}
}