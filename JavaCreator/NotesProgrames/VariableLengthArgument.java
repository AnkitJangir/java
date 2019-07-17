/**
 * @(#)VariableLengthArgument.java
 *
 *
 * @author Ankit Jangir
 * @version 1.00 2016/12/30
 */


public class VariableLengthArgument 
{
	public int sum(int ... a)
	{
		int i,total=0;
		for(i=0;i<a.length;i++)
		{
			total += a[i];
		}
		return total;
	}
    public  static void main(String args[])
    {
    	VariableLengthArgument va=new VariableLengthArgument ();
    	int x,y,z;
    	x=va.sum(3,4);
    	System.out.println(x);
    	y=va.sum(3,4,5,6);
    	System.out.println(y);
    	int arr[]={10,20,30};
    	z=va.sum(arr);
    	System.out.println(z);
    }
}