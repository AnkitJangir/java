import java.io.*;
import java.util.*;
class link 
{
            LinkedList list = new LinkedList();       
            synchronized public void writeToLink(int c)
            {
                        list.add(c);
                        notify();
            }  
             synchronized public Object writeToFile()
            {
                        while(list.size()==0)
                        {
                                    try
                                    {
                                        wait();
                                    }
                                    catch(InterruptedException e)
                                    {
                                       System.out.println(e.getMessage());
                                    }
                        }
                        Object o=list.get(0);
                        list.removeFirst();
                        return o; 
            }           
}
class ReadFromFile extends Thread
{
            link list = new link();
            File file[];
            int count=0;
            public ReadFromFile(link l , String s)
            {
                        list=l;
                        File f=new File(s);
                        file=f.listFiles();
                        count=file.length;
                        for(File fi : file)
                                System.out.println(fi.getName());
            }
            public void run()
            {
                        for(int i=0 ; i<count ;i++)
                        {
                                    try
                                    {
                                                FileInputStream fis = new FileInputStream(file[i]);
                                                int c;
                                                while((c=fis.read())!=-1)
                                                {
                                                            list.writeToLink(c);
                                                }
                                                list.writeToLink(-1);
                                    }
                                    catch(Exception e)
                                    {
                                                System.out.println(e.getMessage());
                                    }
                            }            
            }
}
class ReadFromLink extends Thread
{
            link ln = new link();
            File file[];
            int count=0;
            String str=new String();
            public ReadFromLink(link l , String s1 , String s2)
            {
                        ln=l;
                        File f=new File(s1);
                        file= f.listFiles();
                        count= file.length;
                        str=s2;
            }          
            public void run()
            {
                        try
                        {
                                    for(int i=0 ; i<count ; i++)
                                    {
                                                String s=str;
                                                s=s+"\\"+(i+1)+".txt";
                                                File f=new File(s);
                                                FileOutputStream fos = new FileOutputStream(f);
                                                while(true)
                                                {
                                                      System.out.println(Thread.currentThread());
                                                            int d =(Integer)ln.writeToFile();
                                                            if(d!= (-1))
                                                                        fos.write(d);
                                                            else
                                                                        break;
                                                }
                                    }
                        }
                        catch(Exception e)
                        {
                                    System.out.println(e.getMessage());
                      }            
            }    
}

