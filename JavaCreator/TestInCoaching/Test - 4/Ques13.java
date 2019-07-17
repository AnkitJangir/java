public class Ques13{}
class Fur{}
abstract class Pet
{
	public abstract void eat();
	public abstract void sleep();
}
class Dog extends Pet
{
	Ques13 leftFront=new Ques13(),rightFront=new Ques13();
	Ques13 leftRear=new Ques13(),rightRear=new Ques13();
	Fur fur=new Fur();
	public Fur shed()
	{
		return fur;
	}
	public void eat(){}
	public void sleep(){}
}
class Cat extends Dog
{
	public void ignoreOwner(){}
	public void climbTree(){}
}