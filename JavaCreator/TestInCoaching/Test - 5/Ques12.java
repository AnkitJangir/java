public class Ques12
{
	String doStuff()
	{
		return "howdy";
	}
}
class Supplier extends Ques12
{
	String doStuff()
	{
		return "send money";
	}
	public static void main(String args[])
	{
		Supplier s1=new Supplier();
		Ques12 c3=new Ques12();
		Ques12 c1=s1;
		Supplier s2=(Supplier)c1;
		Supplier s3=(Supplier)c3;
		Supplier s4=new Ques12();
	}
}