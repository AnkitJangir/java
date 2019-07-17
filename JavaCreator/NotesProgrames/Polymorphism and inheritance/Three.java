/**
 * @(#)Three.java
 *
 *
 * @author Ankit Jangir
 * @version 1.00 2017/1/1
 */
class One
{
	public void say()
	{
		System.out.println("One");
	}
	public static void speak()
	{
		System.out.println("First");
	}
	public void show()
	{
		say();
		speak();
	}
}
class Two extends One
{
    public void say()
    {
    	System.out.println("Two");
    }    
   	public static  void speak()
    {
    	System.out.println("Second");
    }
   	
    public static void main(String args[])
    {
    	One o=new Two();
    	o.say();
    	o.speak();
    	o.show();
    }
}
