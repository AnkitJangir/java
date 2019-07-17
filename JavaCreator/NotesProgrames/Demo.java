class One
{
	int x;
	public void setX(int a)
	{
		x=a;
	}
	public void showX()
	{
		System.out.println("X="+x);
	}
}
class Two extends One
{
	private int y;
	public void setXY(int a,int b)
	{
		setX(a);
		y=b;
	}
	public void showXY()
	{
		showX();
		System.out.println("Y="+y);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Two t=new Two();
		t.setXY(3,4);
		t.showXY();
	}
}