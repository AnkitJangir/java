class NewThread implements Runnable
{
	String name;
	Thread t;
	Newthread(String thredaname)
	{
		name=threadname;
		t=new Thread(this,name);
		System.out.println("New Thread:"+t);
		t.start();
	}
	public void m]run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.pritnln(name+":"+i);
				Thread.sleep();
			}
			
		}
		catch(InterruptedException e)
		{
			System.out.println(name+"interrupted.");
		}
		System.out.println(name+"exiting");
	}
}
class DemoJoin
{
	public static void main(String args[])
	{
		NewThread ob1=new NewThread("One");
		NewThread ob2=new NewThread("Two");
		NewThread ob3=new NewThread("Three");
		System.out.println("Thread is alive : "+obj1.isAlive());
		System.out.println("Thread is alive : "+obj1.isAlive());
		System.out.println("Thread is alive : "+obj1.isAlive());
		System.out.println("Thread is alive : "+obj1.isAlive());
		
	}
}