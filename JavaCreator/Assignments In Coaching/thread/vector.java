import java.io.*;
import java.util.*;
class vector
{
	
	Vector v=new Vector();
	synchronized public void writeToVector(int c)
	{
		// list.add(c);
		v.add(c);
		//notify();
	}
	synchronized public Object writeToFile()
	{
		while(v.size()==0)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.print(e.getMessage());
			}
		}
		Object o=v.get(0);
		v.remove(0);
		return o;
	}
}
