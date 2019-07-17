public class Ques19
{
	static int m(int i)
	{
		System.out.println(i+" ");
		return i;
	}
	public static void main(String args[])
	{
		int i=1;
		m(m(i++)+m(i++)+m(-i)+m(i++));
	}
}