import java.io.*;
import java.util.*;
class ReadFromFile extends Thread
{
	public void multiThreadRead(int num)	
	{
		for(int a=1; a<= num; a++) 
		{ 
        		new Thread(readfile(a),""+a).start(); 
     		} 
	}
    	vector list=new vector();
    	File file[];
    	int count=0;
    	public ReadFromFile(vector l,String s)
    	{
    		list=l;
    		File f1=new File(s);
    		file=f1.listFiles();
    		count=file.length;
    		for(File fi:file)
            	System.out.println(fi.getName());
    		System.out.println("Number of Files Are: "+count);
    	}
	private Runnable readfile(int num)
	{
    		return new Runnable()	
		{
    			public void run()
    			{
				for(int i=0;i<count;i++)
    				{
    	
    					try
    					{
    						FileInputStream fis=new FileInputStream(file[i]);
    						int c;
    						while((c=fis.read())!=-1)
    						{
    							list.writeToVector(c);
    						}
    						list.writeToVector(-1);
    					}
    					catch(Exception e)
    					{
    						System.out.print(e.getMessage());
			   		}	
				}
    			}
		};
	}
} 

