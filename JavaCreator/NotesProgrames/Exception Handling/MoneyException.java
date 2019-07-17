/**
 * @(#)MoneyException.java
 *
 *
 * @author Ankit Jangir
 * @version 1.00 2016/12/31
 */
class InvalidAmountException extends Exception
{
	public InvalidAmountException(String str,Throwable th)
	{
		super(str,th);
	}
}
public class MoneyException 
{
	private int rs,paisa;
	public MoneyException() 
	{
		rs=paisa=0;
    }
    public MoneyException(int rs,int paisa)
    {
    	this.rs=rs;
    	this.paisa=paisa;
    }
    public MoneyException(MoneyException me)
    {
    	rs=me.rs;
    	paisa=me.paisa;
    }
    public void set(int r,int p) throws InvalidAmountException
    {
    	if(r>=0&&p>=0)
    	{
    		rs=r;
    		paisa=p;
    	}
    	else
    	{
    		Throwable th=new Throwable("Amount");
    		InvalidAmountException e=new InvalidAmountException("Amount can't be negative",th);
    		throw e;
    	}
    }
    public void show()
    {
    	System.out.println("rs::"+rs+"."+paisa);
    }
    public static void main(String args[])
    {
    	MoneyException m1=new MoneyException();
    	try
    	{
    		m1.set(100,-20);
    	}
    	catch(InvalidAmountException e)
    	{
    		System.out.println(e.getMessage());
    	}
    	m1.show();
    }
}