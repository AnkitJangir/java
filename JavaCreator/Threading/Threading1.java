class One extends Thread
{
	public void  run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("I am First");
		show1();
	}
	public void show1()
	{
		for(int i=1;i<=10;i++)
			System.out.println("25");
	}
}
class Two extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("I am Second");
	}
}
class Three extends Thread
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
		o.start();
		o.start();
		o.show1();
		Two t=new Two();
		t.start();
		Three th=new Three();
		th.start();
		for(int i=1;i<=10;i++)
			System.out.println("I am main");
	}
}