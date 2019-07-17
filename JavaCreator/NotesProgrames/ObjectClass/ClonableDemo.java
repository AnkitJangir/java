class Money implements Cloneable
{
	private int  rs,paisa;
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
	public Object clone()
	{
		Money temp=new Money();
		temp.rs=rs;
		temp.paisa=paisa;
		return temp;
	}

	public Money (int rs,int paisa)
	{
		this.rs=rs;
		this.paisa=paisa;
	}
	public static void main(String args[])
	{
		Money m1=new Money(10,20);
		Money m2;
		m2=(Money)m1.clone();
	}
}