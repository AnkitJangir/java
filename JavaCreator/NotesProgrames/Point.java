/**
 * @(#)Point.java
 *
 *
 * @author Ankit Jangir
 * @version 1.00 2016/12/30
 */


public class Point 
{
	private int x,y;
	final private int z;
	
    public Point() 
    {
    	x=y=0;
    	z=0;		//Compulsary to initialize the final variable z in all the constructor
    }
    public Point(int a,int b) 
    {
    	x=a;
    	y=b;
    	z=30;
    }
    public void set(int a,int b)
    {
    	x=a;
    	y=b;
    }
    public void show()
    {
    	System.out.println("x:"+x+"y:"+y+"z:"+z);
    }
    public static void main(String args[])
    {
    	Point p1=new Point ();
    	p1.show();
    	p1.set(70,80);
    	p1.show();
    	Point p2=new Point(10,20);
    	p2.show();
    	p2.set(30,40);
    	p2.show();
    }
    
}