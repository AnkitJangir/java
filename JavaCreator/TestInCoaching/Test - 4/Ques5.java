public class Ques5
{
	private int a;
	public static int b;
	public static void main(String args[])
	{
		Ques5 r1=new Ques5(),r2=new Ques5();
		r1.a++;
		r1.b++;
		System.out.println(r1.a+","+r1.b+","+r2.a+","+r2.b);
	}
}