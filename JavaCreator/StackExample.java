import java.util.*;
class stackexample
{
	static void showpush(Stack<Integer> st,int a)
	{
		st.push(a);
		System.out.println("push("+a+")");
		System.out.println("stack: "+st);
		
	}
	static void showpop(Stack<Integer> st)
	{
		System.out.println("pop ->");
		Integer a=st.pop();
		System.out.println(a);
		System.out.println("Stack : "+st);
		
	}
	public static void main(String args[])
	{
		Stack<Integer> st=new Stack<Integer>();
		showpush(st,42);
		showpush(st,66);
		showpush(st,85);
		showpush(st,99);
		showpush(st,40);
		showpush(st,55);
		showpop(st);
		showpop(st);
		showpop(st);
		showpop(st);
		showpop(st);
		showpop(st);
		try
		{
			showpop(st);
		}
		catch(EmptyStackException e)
		{
			System.out.println("Empty Stack");
			
		}
	}
}