class Animal
{
	static public int x=100;
	public void speak()
	{
		System.out.println("Animal speaks");
	}
	public void move()
	{
		System.out.println("Animal move");
	}
	static public void show()		//// polymorphism not apply on the static method 
	{
		System.out.println("x:"+x);
	}
}
class Dog extends Animal
{
	public static int x=200;
	public void speak()
	{
		System.out.println("Dog barks");
	}
	public void move()
	{
		System.out.println("Dog jumps");
	}
	public static void show()
	{
		System.out.println("X:"+x);
	}
}
class Horse extends Animal
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
		Animal a;
		a=new Animal();
		a.show();
		System.out.println(a.x);
		a=new Dog();
		a.speak();
		a.move();
		a.show();	//polymorphism not apply on the static method and depend on the reference variable not on object of the class
		System.out.println(a.x);
		a=new Horse();
		a.speak();
		a.move();
	}
}