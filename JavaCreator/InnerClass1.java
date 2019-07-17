class One
{
	private int x=5;
	class Two
	{
		private int y=10;
		public void show()
		{
			System.out.println("x="+x+"y="+y);
		}
	}
}
class Demo
{
	public static void main(String args[])
	{
		One o1=new One();
		One o2=new One();
		One.Two t=o1.new Two();
		t.show();
		One.Two t2=new One().new Two();
		t2.show();
		new One().new Two().show();
	}
}