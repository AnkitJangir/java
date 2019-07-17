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
		b=m.b;
	}
	public void set(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void show()
	{
		System.out.println(a+":"+b);
	}
}
class UseRationalInConstructor
{
	public static void main(String args[])
	{
		RationalInConstructor m1=new RationalInConstructor();
		System.out.print("The First ratio is");
		m1.show();
		RationalInConstructor m2=new RationalInConstructor(20,55);
		System.out.print("The Second Ratio is");
		m2.show();
		RationalInConstructor m3=new RationalInConstructor(m2);
		System.out.print("The Third Ratio is");
		m3.show();
		m1.set(55,84);
		m1.show();
	}
}

