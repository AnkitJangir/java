import java.io.IOException;
public class Ques6
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Hello World");
		}
		catch(IOException e)
		{
			System.out.println("I've never seen println fail");
		}
	}
}