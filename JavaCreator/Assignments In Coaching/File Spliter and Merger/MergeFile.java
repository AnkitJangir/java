import java.io.*;
class MergeFile
{
      public static void main(String arg[])throws IOException
      {
             String filename;
             int k=0;
             Console con = System.console();
             System.out.println("Name of File to be Merge: ");
             String M=con.readLine();
           
		    for(int i=0;;i++)
		    {
		       String str=i+"."+M;
		       File f=new File(str);
		       if(f.exists())
		       {
			         FileInputStream fis=new FileInputStream(f);
			         File f2=new File(M);
			         FileOutputStream fos=new FileOutputStream(f2,true);
			         k++;
          
            	 int ch;
			         while((ch=fis.read())!=-1)
                {
                  fos.write(ch);
                }
                fis.close();
                f.delete();  
             
           }
           else
		          break;
             
        }
        System.out.println("\n"+k+" File to be Merged");
             
   }
}