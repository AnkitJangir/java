class A
{
	int a;
	A(int a)
	{
		this.a=a;
		
	}
	
}
class B extends A
{
	int b;
	B(int a,int b)
	{
		super(a);
		this.b=b;
		
	}
}
class C extends B
{
	public void show()
	{
		System.out.println(a+""+b);
	}
}
class D
{
	public static void main(String arga[])
	{
		C c=new C();
		B b=new B(10,20);
		c.show();
	}
}