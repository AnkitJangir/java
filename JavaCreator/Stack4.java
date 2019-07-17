import java.util.*;
class Stack1<T>
{
	private Vector <T> v=new Vector<T>();
	public void push(T obj)
	{
		v.add(obj);
	}
	public T pop()
	{
		T obj=null;
		obj=v.lastElement();
		v.remove(v.size()-1);
		return obj;
	}
	public boolean empty()
	{
		if(v.size()==0)
			return true;
		else
			return false;
	}
	
	
}

class Stack3
{
	public static void main(String args[])
	{
		String arr[]={"ios","r","Android"};
		Vector <String>v=new Vector<String>();
		Stack s=new Stack();
		for(int i=0;i<arr.length;i++)
		{
			v.add(arr[i]);
			s.push(arr[i]);
		}
		for(int i=0;i<v.size();i++)
		{
			try
			{
			
				if(!s.empty())
				{
					System.out.println((String)s.pop());
				}
		
			}
			catch(EmptyStackException e)
			{
				System.out.println("Empty Stack cant allow");
			}
		}
	}		
}
