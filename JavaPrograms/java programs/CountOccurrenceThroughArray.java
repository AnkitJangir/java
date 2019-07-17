import java.io.*;
class CountOccurrenceThroughArray
{
	public static void main(String[] args) 
	{
        	int n, x, count = 0, i = 0;
        	Console con = System.console();
        	System.out.print("Enter no. of elements for Arrays:");
        	n = Integer.parseInt(con.readLine());
        	int a[] = new int[n];
        	System.out.println("Enter all the elements:");
        	for(i = 0; i < n; i++)
        	{
            		a[i] = Integer.parseInt(con.readLine());
        	}
        	System.out.print("Enter the element to count occurrences:");
        	x = Integer.parseInt(con.readLine());
        	for(i = 0; i < n; i++)
        	{
            		if(a[i] == x)
            		{
                		count++;
            		}
        	}
        	System.out.println("Number of Occurrence of the Element:"+count);
    	}
}