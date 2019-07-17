public class Ques9
{
	public void go()throws Exception
	{
		System.out.println("hello");
	}
}
class B extends Ques9
{
	public void go()
	{
		System.out.println("hello1");
	}
	public static void main(String args[])
	{
		Ques9 a=new B();
		a.go();
	}
}