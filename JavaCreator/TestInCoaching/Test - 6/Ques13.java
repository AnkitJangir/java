public class Ques13
{
	public final void amethod()
	{
		System.out.println("amethod");
	}
}
class Fin extends Ques13
{
	public static void main(String args[])
	{
		Ques13 b=new Ques13();
		b.amethod();
	}
}