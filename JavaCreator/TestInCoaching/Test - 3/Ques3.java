public class Ques3
{
	public static void main(String args[])
	{
		String s1=new String("ABCDEFG"),s2=new String ("EFGHIJ");
		String s3=s1.substring(4,7),s4=s2.substring(0,3);
		System.out.println((s3==s4)+","+(s3+s4).equals(s4+s3));
	}
}