interface X
{
	int p=10;
	void a();
	void b();
}
interface Y
{
	int p=20;	
	void c();
	void d();
}
interface Z extends X,Y
{
	int p=30;
	void e();
	void f();
}
class Demo implements Z
{
	public void a()
	{
		System.out.println("1");
	}
	public void b()
	{
		System.out.println("3");
	}
	/*public void a()
	{
		System.out.println("Akki Jangir");
	}
	public void b()
	{
		System.out.println("Ankit jangir");
	}*/
	public void c()
	{
		System.out.println("4");
	}
	public void d()
	{
		System.out.println("5");
	}
	public void e()
	{
		System.out.println("6");
	}
	public void f()
	{
		System.out.println("7");
	}
}
class Demo2
{
	public static void main(String args[])
	{
		Z a;
		a=new Demo();
		a.a();
		a.b();
		a.c();
		a.d();
		a.e();
		a.f();
		System.out.println(X.p);
		System.out.println(Y.p);
		System.out.println(Z.p);
	}
}