abstract class D
{
	String s1="D";
	String getS1()
	{
		return s1;
	}
}
public class Ques12 extends D
{
	String s1="E";
	String getS()
	{
		return s1;
	}
}
class F
{
	public static void main(String args[])
	{
		D x=new Ques12();
		System.out.println(x.s1+x.getS1());
	}
}