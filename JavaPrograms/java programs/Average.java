import java.io.*;
class Average
{
 	public static void main(String args[])
 	 {
 	  	Console con=System.console();
 		int arr[]=new int[10];
      		int i,sum,avg;
		System.out.print("Enter values");
		for(i=0,sum=0;i<arr.length;i++)
		 {
			arr[i]=Integer.parseInt(con.readLine());
			sum=sum+arr[i];
		 }
		 avg=sum/arr.length;
		 System.out.println("Average is"+avg);
		 System.out.println("Values above average are");
		 for(i=0;i<arr.length;i++)
		  {
			if(arr[i]>avg)
			{
				System.out.print(arr[i]+" ");
			}
		   }
	}
}
