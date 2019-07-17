interface Animal
{
	void speak();
	void move();
	int No_Of_Legs=4;
}
class Dog implements Animal
{
	public void speak()
	{
		System.out.println("Dog barks");
	}
	public void move()
	{
		System.out.println("Dog jumps");
	}
}
class Horse implements Animal
{
	public void speak()
	{
		System.out.println("Horse neighs");
	}
	public void move()
	{
		System.out.println("Horse runs");
	}
}
class Jungle
{
	public static void main(String args[])
	{
		System.out.println("Animal has "+Animal.No_Of_Legs+" Legs");
		Animal a;
		a=new Dog();
		a.speak();
		a.move();
		System.out.println("Dog has "+Dog.No_Of_Legs+"Legs");
		a=new Horse();
		a.speak();
		a.move();
		System.out.println("Horse has "+Horse.No_Of_Legs+" Legs");
	}
}
