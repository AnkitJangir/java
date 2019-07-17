import java.io.*;
class Mainn
 {
       public static void main(String args[])throws Exception
    {	
		          
		          File f=new File(args[0]);     
	              String[] str=f.list();
		          System.out.println(str.length);
                  System.out.println("File Names Are:-");
		          total[] t=new total[str.length];
		          for(int i=0;i<str.length;i++)
		           { 
	               		System.out.println(""+str[i]);
	               		String filepath=f.getAbsolutePath()+"\\"+str[i];
		           	    total t1=new total(f.getAbsolutePath(),str[i],str.length);
		           	    t[i]=t1;
		           	    t[i].start();
	               }
     }
                    
 }