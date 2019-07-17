import java.io.*;
class Split
{
	public static void main(String arg[])throws IOException
	{
       		Console con = System.console();
	        System.out.print("Enter File Name: ");	
	        String filename=con.readLine();
	        File f=new File(filename);
	        FileInputStream fis=new FileInputStream(f);
		BufferedInputStream bis=new BufferedInputStream(fis,102400);
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
				BufferedOutputStream bos=new BufferedOutputStream(fos,102400);
                  		if(!f1.exists())
                        	{
                             		f1.createNewFile();  
                        	}    	     
                        	for(int j=0;j<dfs;j++)
                         	{ 
                     	        	if((ch=bis.read())!=-1)
                                    	{
                                      		bos.write(ch);
                                    	}
                                    	else
                                    	{
                                      		break;     
                                    	}
                  	     	}  
            		}
            		bis.close();
            		if(f.delete())
			{
            			System.out.print("Deleted");
			}
            		else
			{
            			System.out.print("Not Deleted");
        		}
		}
	}
}