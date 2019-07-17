import java.io.*;
import java.util.*;
class total extends Thread
 {
	 private String filepath;
	 private String filename;
	 private int objects;
	 private int grandtotal;
	
	 total(String path,String str1,int obj)
	 {
		
		filename=str1;
		filepath=path+"\\"+str1;
		objects=obj;
	 }
	  public void run()
	 {
		 
	 try
	 { 
	      Scanner sc=new Scanner(new File(filepath));
		 String str;
		 int total=0,i=0;
          while(sc.hasNext())
		 {
			 
			 String decision="yes";
			 str=sc.next();
			 try{
                                 i=Integer.parseInt(str);
                            }
			 catch(NumberFormatException e)
                            {
                                  decision="no";
                            }
			 
			    if(decision.equals("yes"))
				{
				   total=total+i;//Integer.parseInt(str);
                     if(sc.hasNextLine())					
			        sc.nextLine();
				}
		 }
		
		 System.out.println("TOTAL OF  "+this.filename+" ="+total);
		 grandtotal+=total;
		 objects--;
		 if(objects==0)
		 {
                     String grand="GRAND TOTAL="+grandtotal;
		 	         // String  grand=grandtotal;
             //        File f=new File("sum.txt");
             //        FileOutputStream fos=new FileOutputStream(f);
             //        fos.write(grand);
             //        fos.close();
	             Formatter fo=new Formatter("total.txt");
	             fo.format(grand);
	                fo.close();			
		   }
                       this.stop();
      }
		catch(Exception e)
	    {
	    	System.out.println("exception="+e.getMessage());
	    }
	}	 
	 
}
 
 