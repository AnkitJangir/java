import java.io.*;

class lll
{
	public static void main(String args[])
	{
		String ss="b";
		book bb = new book();  // clasess obj's
		Dvd dd = new Dvd();
		Console con = System.console();
		xx  arr[] = new xx[4];
		for(int j=0; j<4; j++)
          	{
          		System.out.print("Book or Dvd <b/d>:");
		            
                    String s =con.readLine();		
                     if(ss.equals(s))
                     {	
                         arr[j]=new book();
	                     arr[j].read();
	                 
                     }
                     else
                      { 
                      	arr[j]=new Dvd();

	                    arr[j].read();   
	                   // arr[j].show();
	                }
          	
	      
	           }
	           System.out.println("Enter of choice item List");

	           for(int j=0; j<arr.length; j++)
	           {
	           	arr[j].show();
	           }

	   }        
}
