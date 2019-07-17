class One
{
	void say()
	{
		System.out.println("ONE");
	}
	void speak()
	{
		System.out.println("First");
	}
}
class Two extends One
{
	void say()
	{
		System.out.println("Two");
	}
	void speak()
	{
		System.out.println("Second");
	}
}
class Demo
{
	public static void main(String args[])
	{
		One o=new Two();
		o.say();
		o.speak();
	}
}