class UseMoney
{
	public static void main(String args[])
	{
		Money m1=null;
		try
		{
			m1=new Money(-100,20);
		} 
		catch(InvalidAmountException e1)
		{
			System.out.println(e1.getMessage());
		}
		m1.show();
	}
}
