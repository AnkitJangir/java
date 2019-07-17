class HoldInteger
{
	private int sharedInt;
	private boolean empty=true;
	synchronized public int setSharedInt(int value)
	{
		while(!empty)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
				
			}
		}
		sharedInt=value;
		empty=false;
		notify();
		return sharedInt;
	}
	synchronized public int getSharedInt()
	{
		while(empty)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
				
			}
		}
		notify();
		empty=true;
		return sharedInt;
	}
}
class Producer extends Thread
{
	private HoldInteger pHold;
	public Producer(HoldInteger h)
	{
		pHold=h;
	}
	public void run()
	{
		for(int count=1;count<=10;count++)
		{
			pHold.setSharedInt(count);
			System.out.println("Producer assigned->"+count);
			//sleep for random interval.
			try
			{
				sleep((int)(Math.random()*100));
			}
			catch(InterruptedException e )
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
class Consumer extends Thread
{
	private HoldInteger cHold;
	public Consumer(HoldInteger h)
	{
		cHold=h;
	}
	public void run()
	{
		int value;
		value=cHold.getSharedInt();
		System.out.println("Consumer get<-"+value);
		while(value!=10)
		{
			//sleep for random Interval
			try
			{
				sleep((int)(Math.random()*100));
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			value=cHold.getSharedInt();
			System.out.println("Consumer get<-"+value);
		}
	}
}
public class SharedCell
{
	public static void main(String args[])
	{
		HoldInteger h=new HoldInteger();
		Producer p=new Producer(h);
		Consumer c=new Consumer(h);
		p.start();
		c.start();
	}
}