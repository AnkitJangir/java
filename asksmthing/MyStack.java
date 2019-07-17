import java.util.*;
class MyStack
{
	Vector myVector;
	public MyStack()
	{
		myVector=new Vector();
	}
	public void push(Object obj)
	{
		myVector.add(obj);
	}
	public Object pop()
	{
		Object obj=null;
		if(myVector.size()/*&gt;0*/)
		{
			obj=myVector.elementAt(myVector.size()-1);
			myVector.removeElementAt(myVector.size()-1);
		}
		else
			System.out.println("Stack Underflow");
		return obj;
	}
/*	public Object peek()
	{
		Object obj=null;
		if(myVector.size()/*&gt;0)
			obj=myVector.elementAt(myVector.size()-1);
		else
			System.out.println("Stack Underflow");
		return obj;
	}*/
	public static void main(String args[])
	{
		MyStack stack=new MyStack();
		stack.push(new String("One"));
		//System.out.println("Added..&gt;"+stack.peek());
		stack.push(new String("Two"));
		//System.out.println("Added..&gt;"+stack.peek());

		stack.push(new String("Three"));
		//System.out.println("Added..&gt;"+stack.peek());

		System.out.println();
		//System.out.println("The Top of stack now is"+stack.peek());

		stack.pop();
		//System.out.println("The Top of stack now is"+stack.peek());

		stack.pop();	
		//System.out.println("The Top of stack now is"+stack.peek());

		stack.pop();
	}
}