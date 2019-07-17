/**
 * @(#)StaticBlock.java
 *
 *
 * @author Ankit jangir 
 * @version 1.00 2016/12/30
 */
import java.io.*;
public class StaticBlock 
{
    private int x=24;
    private boolean y=true;
    static private int arr[]=new int [5];
    static 
    {
    	Console con=System.console();
    	for(int arr:arr)
    	{
    		System.out.println("Enter the values");
    		arr=Integer.parseInt(con.readLine());
    	}
    	for(int arr:arr)
    	{
    		System.out.println(arr);
    	}
    }    
    
    public static void main(String[] args)
   	{
    	StaticBlock sb1=new StaticBlock();
    	StaticBlock sb2=new StaticBlock();
    }
}
