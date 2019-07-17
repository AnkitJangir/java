class Calculator
{
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	public float sum(float a,float b)
	{
		return a+b;
	}
	public float sum(float a,float b,float c)
	{
		return a+b+c;
	}
	public float sum(int p,float q)
	{
		return p+q;
	}
	
	public float sum(float p,int q)
	{
		return p+q;
	}
}
class Demo16
{
	public static void main(String args[])
	{
		Calculator calc=new Calculator();
		int x,y;
		float f1,f2;
		x=calc.sum(3,4);
		System.out.println("3+4="+x);
		y=calc.sum(3,4,5);
		System.out.println("3+4+5="+y);
		f1=calc.sum(1.2f,2.5f);
		System.out.println("1.2+2.5="+f1);
		f2=calc.sum(1.2f,5.2f,6.2f);
		System.out.println("1.2+5.2+6.2="+f2);
	}
}
