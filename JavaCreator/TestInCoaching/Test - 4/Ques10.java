public class Ques10
{
	private void printS1()
	{
		System.out.println("R.printS1");
	}
	protected void printS2()
	{
			System.out.println("R.printS2");
	}
	protected void printS1S2()
	{
		printS1();
		printS2();
	}	
}
class S extends Ques10
{
	private void printS1()
	{
		System.out.println("S.printS1");
	}
	protected void printS2()
	{
		System.out.println("S.printS2");
	}
	public static void main(String args[])
	{
		new S().printS1S2();
	}
	
}