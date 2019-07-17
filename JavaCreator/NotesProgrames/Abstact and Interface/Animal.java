/**
 * @(#)Animal.java
 *
 *
 * @author Ankit Jangir
 * @version 1.00 2016/12/31
 */

abstract public  class Animal
{
    abstract public void speak();
    abstract public void move();
    public void say()					// can be utilized through  object of the sub -  class
    {
    	System.out.println("Ankit jangir");
    }
}
class Dog extends Animal
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
    public static void main(String[] args) 
   	{
   		Animal a;
		a=new Dog();
		a.say();
		a.speak();
		a.move();
		a=new Horse();
		a.speak();
		a.move();
   	}
}
