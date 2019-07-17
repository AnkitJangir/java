import java.io.*;
import java.util.*;

class ReadFromVector extends Thread
{
	public void multiTh(int no)
	{
		for(int j=1; j<= no; j++)
		{ 
			new Thread(rv(j),""+j).start(); 
     		} 
	}
	Console con=System.console();
      	vector vc=new vector();
	File file[];
	int count=0;
	String str=new String();
	public ReadFromVector(vector l,String s1,String s2)
	{
		// ln=l;
        	vc=l;
		File f=new File(s1);
        	file=f.listFiles();
        	count=file.length;
        	str=s2;
     	}
	private Runnable rv(int colNum)
	{
    		return new Runnable()
		{
     			public void run()
     			{
     				try
     				{
     	
            				String exten=(".txt");
					for(int i=0;i<count;i++)
     					{
     		
                				String s=str;
                				s=s+"\\"+(i+1)+exten;
     						File f=new File(s);
     						FileOutputStream fos=new FileOutputStream(f);
            					while(true)
     						{
                    					int c=(Integer)vc.writeToFile();
     							if(c!=-1)
                    					{
                
     								fos.write(c);
                    					}
     							else
     							break;
     						}
			   		}
     				}
     				catch(Exception e)
     				{
     					System.out.print(e.getMessage());
     				}
			}
		};
	}
}
	
