public class Ques18
{
	public static void main(String args[])
	{
		StringBuffer sb1=new StringBuffer("ABC");
		StringBuffer sb2=new StringBuffer("ABC");
		System.out.println((sb1==sb2)+","+sb1.equals(sb2));
	}
}