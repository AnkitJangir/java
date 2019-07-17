public class Ques13
{
	int state=0;
	Ques13(int s)
	{
		state = s;
	}
	public static void main(String... hi)
	{
		Ques13 b1=new Ques13(1);
		Ques13 b2=new Ques13(2);
		System.out.println(b1.go(b1)+" "+b2.go(b2));
	}
	int go(Ques13 b)
	{
		if(this.state==2)
		{
			b.state=5;
			go(this);
		}
		return ++this.state;	
	}
}