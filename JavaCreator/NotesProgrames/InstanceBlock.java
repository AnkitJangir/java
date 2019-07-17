/**
 * @(#)InstanceBlock.java
 *
 *
 * @author Ankit Jangir
 * @version 1.00 2016/12/30
 */

public class InstanceBlock
 {
 	private int x=24;
 	private boolean y=true;
 	private int arr[]=new int [5];
 	{
 		int i;
 		for(i=0;i<arr.length;i++)
 		{
 			arr[i]=(int)(Math.random()*100);
 		}
 		for(i=0;i<arr.length;i++)
 		{
 			System.out.println(arr[i]);
 		}
 	}
 	public static void main(String[] args) 
    {
    	InstanceBlock ib1=new InstanceBlock();
    	InstanceBlock ib2=new InstanceBlock();
    	
    }
}
