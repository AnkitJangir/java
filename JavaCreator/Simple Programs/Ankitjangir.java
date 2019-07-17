class Demo
{
	String s;
	int i;
	double d;
	public void set(String n,int a,double d1)
	{
		s=n;
		i=a;
		d=d1;
	}
	public void show()
	{
		System.out.println(s+" "+i+" "+d);
	}
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.set("Ankit",1,1990);
		d1.show();
	}
}