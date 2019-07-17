/**
 * @(#)One.java
 *
 *
 * @author Ankit Jangir
 * @version 1.00 2017/1/1
 */

public class One 
{
	int x;
    public void  One(int a) 
    {
    	x=a;
    }
    public One(int a)
    {
    	x=a;
    }
}
class Two extends One
{
	int y;
	public Two(int a,int b)
	{
		super(a);
		y=b;
	}
	public void show()
	{
		System.out.println("X::"+x+"  Y::"+y);
	}
    public static void main(String[] args) 
    {
    	Two t=new Two(3,4);
    	t.show();
    }
}
