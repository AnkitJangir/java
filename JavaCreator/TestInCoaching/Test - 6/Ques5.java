class Level1Exception extends Exception{}
class Level2Exception extends Level1Exception{}
class Level3Exception extends Level2Exception{}
public class Ques5 
{
	public static void main(String args[])
	{
		int a,b,c,d,f;
		a=b=c=d=f=0;
		int x=1;
		try
		{
			switch(x)
			{
				case 1:throw new Level1Exception();
				case 2:throw new Level2Exception();
				case 3:throw new Level3Exception();
			}
			a++;
		}
		catch(Level3Exception e)
		{b++;}
		catch(Level2Exception e)
		{c++;}
		catch(Level1Exception e)
		{d++;}
		finally 
		{f++;}
		System.out.println(a+","+b+","+c+","+d+","+f);
	}
}