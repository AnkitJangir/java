class Money
{
	private int rs,paisa;
	//private int paisa;
	public void set(int r,int p)
	{
		rs=r;
		paisa=p;
	}
	public void show()
	{
		System.out.println(rs+"."+paisa);
	}
	public static void main(String args[])
	{
		Money m1;
		m1=new Money();
		m1.set(100,20);
		System.out.print("First amount is");
		m1.show();
		Money m2=new Money();
		m2.set(200,30);
		System.out.print("Second amount is");
		m2.show();
	}
}
