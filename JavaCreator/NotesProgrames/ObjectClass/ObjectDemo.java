class Money
{
	private int rs,paisa;
	public Money(int rs,int paisa)
	{
		this.rs=rs;
		this.paisa=paisa;
	}
	public String toString()
	{
		return rs+"."+paisa;
	}
	public boolean equals(Object o)
	{
		if(o==null)
		{
			return false;
		}
		Money m=(Money)o;
		if(rs==m.rs&&paisa==m.paisa)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		Money m=new Money(10,20);
		System.out.println("Amount is :"+m);
		System.out.println(m);
		
	}
}