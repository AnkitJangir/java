import java.io.*;
class InvalidDenominatorException extends Exception
{
	public InvalidDenominatorException(String str)
	{
		super(str);
	}
}
class RationalInConstructor
{
	private int a,b;
	public RationalInConstructor()
	{
		a=b=0;
	}
	public RationalInConstructor(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public RationalInConstructor(RationalInConstructor m)
	{
		a=m.a;
		b=m.a;
	}
	public void set(int a,int b)throws InvalidDenominatorException
	{
		this.a=a;
		this.b=b;
		int i,j;
    		Console con= System.console();
    		System.out.println("Enter values for first rational no.");
    		System.out.print("Enter numerator= ");
    		i=Integer.parseInt(con.readLine());
    		if(i!=0)
    		{

			System.out.print("Enter denominator= ");
       			j=Integer.parseInt(con.readLine());
       			if(j==0)
         		{
				InvalidDenominatorException e=new InvalidDenominatorException("Denominator = 0 is not allowed");
				throw e;
     			}
			else
			{
				this.a=i;
				this.b=j;
			}
		}
	}
	public void show()
	{
		System.out.println(a+":"+b);
	}
}
class UseRational
{ 
	public static void main(String args[])
	{
    		RationalInConstructor m1,m2,m3;
    		int i,j;
    		m1=new RationalInConstructor();
		m1.show();
		m2=new RationalInConstructor(2,5);
		m2.show();
		m3=new RationalInConstructor(m2);
		m3.show();
    		try
		{
			m1.set(5,4);
		}
		catch(InvalidDenominatorException e1)
		{
			System.out.println(e1.getMessage());
		}
		m1.show();
	}
}