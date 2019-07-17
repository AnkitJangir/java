public class Ques10 extends Thread
{
	public void run()
	{
		System.out.println("A");
	}
}
class B
{
	public static void main(String args[])
	{
		Ques10 a=new Ques10();
		a.start();
		a.start();
	}
}