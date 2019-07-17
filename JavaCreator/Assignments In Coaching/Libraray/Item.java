import java.io.*;
interface Item
{
	void read();
  	void show();
}
class Book implements Item
{
	public String title,author,publication;
  	Console con = System.console();
  	public void read()
  	{
		System.out.print("Please Enter Titel of the Book: "); 	 	
    	title = con.readLine();
    	System.out.print("Please Enter Author of the Book: ");
    	author = con.readLine();
    	System.out.print("Please Enter Publication of the Book: ");
    	publication = con.readLine();
  	}
  	public void show()
  	{
		 System.out.println("Book: "+ title +"  Author: "+ author +"  Publication: "+ publication);
  	}
}
class Dvd implements Item
{
	String title,director,category;
  	Console con = System.console();
  	public void read()
  	{
		System.out.print("Please Enter Titel of the Dvd: ");
    	title = con.readLine();
    	System.out.print("Please Enter Director of the Dvd: ");
    	director = con.readLine();
    	System.out.print("Please Enter Category of the Dvd: ");
    	category = con.readLine();
  	}
  	public void show()
  	{ 
		System.out.println("Dvd: "+ title +"  Director: "+ director +"  Category: "+ category);
  	}
}
class Library
{
	public static void main(String args[])
  	{
		String c;
		int i;
   		Item arr[] = new Item[10];
   		Console con = System.console();
   		System.out.println(" hiiii!!!Ankit jangir");
   		System.out.println(" Welcome to the Library");
   		for(i=0;i<10;i++)
   		{
			System.out.print("Book or Dvd <b/d>: ");
       		c =con.readLine();
       		if(c.equals("b"))
       		{
				arr[i]= new Book();
       			arr[i].read();
       		}
       		else
       		{
				arr[i]= new Dvd();
       			arr[i].read();
       		}
    	}
    	System.out.println("     Your selected Items are: ");
    	for(i=0;i<10;i++)
		{
       		arr[i].show();
   		}
  	}
}