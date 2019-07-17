class One
{
	private void say()
	{
		System.out.println("One");
	}
	static public void speak()
	{
		System.out.println("First");
	}
	public void show()
	{
		say();
		speak();
	}
}
class Two extends One
{
	public void say()
	{
		System.out.println("Two");
	}
	static public void speak()
	{
		System.out.println("Second");
	}
}
class Demo
{
	public static void main(String args[])
	{
		One o=new Two();
		o.show();
	}
}
