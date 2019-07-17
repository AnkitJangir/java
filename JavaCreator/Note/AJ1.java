class A
{
	public static int a;
	public static void main(String args[])
	{
		B a = new B();
		B.a=78;
		a.show();
	}
}
class B extends A
{
	public void show()
	{
		System.out.println(a);
	}
}