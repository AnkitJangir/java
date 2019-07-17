public class Ques11 extends Thread
{
	private int i;
	public void run()
	{
		i=1;
	}
	public static void main(String args[])
	{
		Ques11 a=new Ques11();
		a.start();
		System.out.println(a.i);
	}
}