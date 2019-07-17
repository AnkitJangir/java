class NewThread implements Runnable
{
	Thread t;
	NewThread()
	{
		//Create a new Second Thread
		t=new Thread(this,"Demo Thread");
		System.out.println("Child Thread : "+t);
		t.start();
	}
	//this is the Entry point for Second Thread
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Child thread : "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Thread Interrupted ");
		}
		System.out.println("EXiting Child thread");
	}
	
}
class Demo
{
	public static void main(String args[])
	{
		new NewThread();
		try
		{
			for(int i=5;i>0;i++)
			{
				System.out.println("Main Thread : "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("MAin Thraed Exiting" );
	}
}