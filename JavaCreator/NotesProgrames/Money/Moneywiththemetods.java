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
	public void set(int rs,int paisa)
	{
		this.rs=rs;
		this.paisa=paisa;
	}
	public void show()
	{
		System.out.println(rs+"."+paisa);
	}
	public Money add(Money m)
	{
		Money temp=new Money();
		temp.rs=m.rs;
		temp.paisa=m.paisa;
		if(temp.paisa>=100)
		{
			temp.rs++;
			temp.paisa %= 100;
		}
		return temp;
	}
	public Money less(Money m)
	{
		Money temp=new Money();
		int n1,n2,n3;
		n1=rs*100+paisa;
		n2=m.paisa*100+m.paisa;
		n3=n1-n2;
		temp.rs=n3/100;
		temp.paisa=n3%100;
		return temp;
	}
	public Money multiple(int n)
	{
		Money temp=new Money();
		temp.rs=rs*n;
		temp.paisa=paisa*n;
		if(temp.paisa>=100)
		{
			temp.rs+=(temp.paisa/100);
			temp.paisa %= 100;
		}
		return temp;
	}
	public static void main(String args[])
	{
		Money m1=new Money(20,60);
		Money m2=new Money(10,80);
		System.out.print("First amount is ");
		m1.show();
		System.out.print("second amount is");
		m2.show();
		Money m3,m4,m5;
		m3=m1.add(m2);
		System.out.print("sum amount is");
		m3.show();
		m4=m1.less(m2);
		System.out.print("Diffrrence amount is");
		m4.show();
		m5=m1.multiple(6);
		System.out.print("Multipe amount is");
		m5.show();
	}
}
