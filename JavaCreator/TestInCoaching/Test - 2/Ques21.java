public class Ques21
{
	public static void main(String args[])
	{
		String str="hello";
		switch(str)
		{
			case "Hello":
				System.out.println(1);
				break;
			case "hello":
				System.out.println(2);
			case "HE":
				System.out.println(3);
			default:
				System.out.println(4);
		}
	}
}