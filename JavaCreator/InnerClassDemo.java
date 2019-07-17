class One
{
	public void method(int a,final int b)
	{
		int c;
		final int d=10;
		
		class Demo
		{
			int e=20;
			public void show()
			{
				System.out.println("b="+b+"d="+d+"e="+e);
			}
		}
		Demo d1=new Demo();
		d1.show();
	}
}
class A
{
		public static void main(String args[])
		{
			
		}
}

