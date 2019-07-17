class A
{
	public static void main(String args[])
	{
		byte a=3;
		a=(byte)~a;
		System.out.println(a);
		a=(byte)((a<<3)-a);
		System.out.println(a); 
	}
}