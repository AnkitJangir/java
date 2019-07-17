class A
{
	public int a;
	public void input(int x)
	{
		a=x;
	}
	public void show()
	{
		System.out.println(a);
	}
	/*public A()
	{
	}
	public A(int a)
	{
		this.a=a;
	}*/
}
class B extends A
{
	private int b;
	/*public B()
	{
	}
	public B(int a,int b)
	{
		super(a);
		this.b=b;
	}*/
	public void input(int x,int y)
	{
		b=y;
	}
	public void show()
	{
		System.out.println("b->"+b);
	}
	public static void main(String args[])
	{
		B aa=new B();
		aa.input(30);
		aa.show();
		aa.input(10,20);
		aa.show();
	}
}