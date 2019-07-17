public class Ques9
{
	void PrintS1()
	{
		System.out.println("C.printS1");
	}
	static void PrintS2()
	{
		System.out.println("C.printS2");
	} 
}
class Demo extends Ques9
{
	void printS1()
	{
		System.out.println("D.prints1");
	}
	void printS2()
	{
		System.out.println("D.printS2");
	}
	public static void main(String args[])
	{
		Ques9 q=new Ques9();
		q.printS1();
		q.printS2();
	}
}