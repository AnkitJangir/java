class InvalidAmountException extends Exception
{
	public InvalidAmountException(String str)
	{ 
		super(str);
	}
}
class Money
{
	private int rs,paisa;
	public Money()
	{
		rs=paisa=0;
	}
	public Money(int r,int p)throws InvalidAmountException
	{
		rs=r;
		paisa=p;
	}

	public void set(int r,int p)throws InvalidAmountException 
	{
		if(r>=0&&p>=0)
		{
			rs=r;
			paisa=p;
		}
		else
		{
			InvalidAmountException e=new InvalidAmountException("Amount can't be Negative");
			throw e;
		}
	}
	public void show()
	{
		System.out.println(rs+"."+paisa);
	}
}
	