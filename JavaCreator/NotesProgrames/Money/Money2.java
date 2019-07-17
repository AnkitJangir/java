class Money
{
	private int rs;
	private int paisa;
	private static int count=0;
	public Money()
	{
		rs=paisa=0;
		count++;
	}
	public Money(int r,int p)
	{
		rs=r;
		paisa=p;
		count++;
	}
	public Money(Money m)
	{
		rs=m.rs;
		paisa=m.paisa;
		count++;
	}
	public static void showCount()
	{
		System.out.println("No.of objects:"+count);
	}
	public static void main(String[] args)
	{
		Money.showCount();
		Money m1=new Money();
		Money m2=new Money();
		m1.showCount();
		Money m3=new Money();
		Money.showCount();
		Money m4=new Money();
		m3.showCount();
		m4.showCount();
	}
}