public class Ques8
{
	static String s="-";
	String s2="s2";
	Ques8(String arg)
	{
		s+=arg;
	}
}
class Go extends Ques8
{
	Go()
	{
		super(s2);
	}
	{
		s+="i";
	}
	public static void main(String args[])
	{
		new Go();
		System.out.println(s);
	}
}