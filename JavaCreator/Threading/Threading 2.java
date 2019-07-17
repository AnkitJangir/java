class One implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("I am First");
	}
}
class Two implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("I am Second");
	}
}
class Three implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("I am Third");
	}
}
class Demo
{
	public static void main(String args[])
	{
		One o=new One();
		Thread t1=new Thread(o);
		t1.start();
		Two t=new Two();
		Thread t2=new Thread(t);
		t2.start();
		Three th=new Three();
		Thread t3=new Thread(th);
		t3.start();
		for(int i=1;i<=10;i++)
			System.out.println("I am main");
	}
}