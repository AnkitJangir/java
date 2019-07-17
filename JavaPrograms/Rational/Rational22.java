class Rational
{
	private int a,b,c;
	public void set(int p,int q)
	{
		int r;
		a=p;
		b=q;
		r=a/b;
	}
	public void show()
	{
		System.out.println("The result is="+c);
	}
}
class UseRational
{
	public static void main(String args[])
	{
		Rational m1;
		m1=new Rational();
		m1.set(24,3);
		m1.show();
		Rational m2=new Rational();
		m2.set(88,44);
		m2.show();
	}
}