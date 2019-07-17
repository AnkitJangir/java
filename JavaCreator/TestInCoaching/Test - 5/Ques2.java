public class Ques2
{
	private Confusing(Object o)
		System.out.println("Object");
	private Confusing (double []array)
		System.out.println("Double array");
	public static void main(String args[])
	{
		new Confusing (null);
	}
}