import java.util.*;
//import java.io.*;
class UnderFlowException extends Exception
{
	public UnderFlowException(String str)
	{
		super(str);
	}
}
class Stack1
 {
 		Vector vv; 
     	 	public Stack1()
 	 	{
 	 		vv= new Vector();
 	 	}
 	 	public Object push(Object o)
 	  	{
       		if (o==null)
          	{
				System.out.println("no value to push");
          	}
			else
          	{
         		vv.add(o);
           	}
          	return o;
 		}
 	  	public Object pop()throws UnderFlowException
 	  	{
        	if(vv.size()==0)
          	{
          		UnderFlowException e= new UnderFlowException("UnderFlowException");
           		throw e;
           	}
           	else
           	{
           		Object ob = vv.get(vv.size()-1);
           		vv.remove(vv.size()-1);
           		return ob; 
       		}
 	  	} 
       	public Boolean empty()
       	{
       		if(vv.size()==0)
       		{
				return true;
       		}
			else
       		{
				return false;
       		}
		}
}
class Stack2
{
	public static void main(String args[])
	{
	  	Stack1 s = new Stack1();
	  	try
	  	{
	  	s.push("Ankit Jangir");
      		s.push("Ankur Jangir");
      		s.push("Tarun Jangir");
      		s.push("Rahul");
      		s.push("Sanju");
			// s.push("rams");
			
			System.out.println(s.pop());
     		System.out.println(s.pop());
     		System.out.println(s.pop());
     		System.out.println(s.pop());
     		System.out.println(s.pop());
     		System.out.println(s.pop());
	 	 }
   	  	 catch(UnderFlowException e)
   	  	 {
	     	System.out.println(e.getMessage());
	  	 }
	}
}