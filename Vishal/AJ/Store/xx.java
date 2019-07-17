import java.io.*;
interface xx
{
	void read();
	void show();

}
class book implements xx
{

	String title,author,publication;
    Console con =System.console();
	public void read()
	 {
	 	System.out.print("enter a book");
	 	 title = con.readLine();
	     author = con.readLine();
	    publication = con.readLine();
        
	 }
	public void show()
	 {
	 	 
	 	System.out.println("Title :"+title+"  "+"Author  :"+author+"  "+"  "+"Publication  :"+publication);
	 }
}
class Dvd  extends book implements xx  // extends con mathed and veriable title
{
	String ditectory,category;
	public  void read()
	 {
	 	System.out.print("Enter a dvd");
	 	 title = con.readLine();
	     ditectory = con.readLine();
	    category = con.readLine();

	 }
	public  void show()
	 {
	 	
	 	System.out.println("title ::"+title+"  "+"ditectory ::"+ditectory+"  "+"category :"+category);
	 }


}