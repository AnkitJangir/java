public class Ques17 extends Philosopher
{
	Ques17()
	{
		this("Bart");
	}
	Ques17(String s)
	{
		super(s);
	}
	/*Ques17()
	{
		super("Bart");
	}
	Ques17(String s)
	{
		super(s);
	}*/
	public static void main(String args[])
	{
		new Ques17("Home");
		new Ques17();
	}
}
class Philosopher
{
	Philosopher(String s)
	{
		System.out.println(s+" ");
	}
}
