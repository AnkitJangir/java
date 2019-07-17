public class Ques29 extends Thread
{
	public void run()
	{
		System.out.println("MyThread:run()");
	}
	public void start()
	{
		System.out.println("MyThread:start()");
	}
}
class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("MyRunnable:run()");
	}
	public void start()
	{
		System.out.println("MyRunnable:start()");
	}
}
class MyTest
{
	public static void main(String args[])
	{
		Ques29 m=new Ques29();
		MyRunnable mr=new MyRunnable();
		Thread thread=new Thread(mr);
		m.start();
		thread.start();
	}
}