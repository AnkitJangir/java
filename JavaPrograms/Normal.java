class One
{
	int x;
	public void One(int a) 
	{
		x=a;
	}
}
class Two extends One
{
	int y;
	public Two(int a,int b)
	{
		One(a);
		//super(a);
		y=b;
	}
	public void show()
	{
		System.out.println("x="+x+"y="+y);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Two t=new Two(3,4);
		t.show();
	}
}
