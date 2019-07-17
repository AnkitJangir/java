class Money
{
	private int rs,paisa;
	public Money()
	{
		rs=paisa=0;
	}
	public Money(int rs,int paisa)
	{
		this.rs=rs;
		this.paisa=paisa;
	}
	public Money(Money m)
	{
		rs=m.rs;
		paisa=m.paisa;
	}
	public void set(int r,int p)
	{
		rs=r;
		paisa=p;
	}
	public void show()
	{
		System.out.println(rs+"."+paisa);
	}
}
class UseMoney
{
	public static void main(String args[])
	{
		Money m1=new Money();
		System.out.println("First amount is");
		m1.show();
		Money m2=new Money(100,20);
		System.out.println("second amount is");
		m2.show();
		m1.set(200,30);
		System.out.println("Now First amount is");
		m1.show();
		Money m3=new Money(m2);
		System.out.println("Third amount is");
		m3.show();
	}
}
