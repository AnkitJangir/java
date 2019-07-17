public class Ques14
{
	public void m1()
	{
		System.out.println("A1");
	}
}
class B extends Ques14
{
	public void m1()
	{
		System.out.println("B1");
	}
	public void m2()
	{
		System.out.println("B2");
	}
}
class C
{
	public static void main(String args[])
	{
		Ques14 a1=new B();
		a1.m1();
		a1.m2();
		((B)a1).m1();
		((B)a1).m2();
	}
}