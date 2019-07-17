public class Ques30 implements Runnable
{
	String myString="Yes";
	public void run()
	{
		this.myString="No";
	}
	public static void  main(String args[])
	{
		Ques30 t=new Ques30();
		new Thread(t).start();
		for(int i=0;i<10;i++)
		{
			System.out.println(t.myString);
		}
	}
}