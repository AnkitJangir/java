public class Ques8
{
	String s1="A.s1";
	String s2="A.s2";
}
class B extends Ques8
{
	String s1="B.s1";
	public static void main(String args[])
	{
		B x=new B();
		Ques8 y=(Ques8)x;
		System.out.println(x.s1+""+x.s2+""+y.s1+""+y.s2);
	}
}