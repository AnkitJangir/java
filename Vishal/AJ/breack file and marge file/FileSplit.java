import java.io.*;
class FileSplit
{
	public static void main(String arg[])throws IOException
	{
               Console con = System.console();
	          System.out.print("Enter File Name: ");	
	          String filename=con.readLine();
	          File f=new File(filename);
	          FileInputStream fis=new FileInputStream(f);
           if(f.exists())
           { 	
        	
        	    int  nof;
        	    long filesize=f.length();
        	    System.out.println("Source File Size: "+filesize);
        	    System.out.print("Enter destination file size:");
        	    int  dfs=Integer.parseInt(con.readLine());
       
        	    if(filesize%dfs==0)
        	    {
        		    nof=(int)filesize/dfs;
        	    }
        	    else
            	   {
        		     nof=(int)filesize/dfs;
        		     nof=nof+1;
        	    } 
        	      int ch;
        	     for(int i=0;i<nof;i++)
        	     {
                       File f1=new File(i+"."+filename);
                       FileOutputStream fos=new FileOutputStream(f1);
    
                  	if(!f1.exists())
                        {
                             f1.createNewFile();  
                        }    	
                            
                        for(int j=0;j<dfs;j++)
                         {
                               
                     	    		
                  	            if((ch=fis.read())!=-1)
                                    {
                                      fos.write(ch);
                                    }
                                    else
                                    {
                                      break;     
                                    }
                  	    	
                  	     }  
                  	    
            }
            fis.close();
            if(f.delete())
            	System.out.print("Deleted");
            else
            	System.out.print("Not Deleted");
        }
	}
}