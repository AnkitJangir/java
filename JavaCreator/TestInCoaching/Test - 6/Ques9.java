public class Ques9 extends Thread
{
	public Ques9(Runnable r)
	{
		super(r);
	}
	public void run()
	{
		System.out.println("A");
	}
}
class B implements Runnable
{
	public void run()
	{
		System.out.println("B");
	}
}
class C 
{
	public static void main(String args[])
	{
		new Ques9(new B()).start();
	}
}