import java.io.*;
import java.util.*;
class MRTF1
{
            public static void main(String sachin[])
            {
                        link ln = new link();
                        Console con= System.console();
                        System.out.print("enter address of directory of source files : ");
                        String s1=con.readLine();
                        System.out.print("enter address of directory of destination files : ");
                        String s2=con.readLine();
                        ReadFromFile rf=new ReadFromFile( ln , s1 );
                        ReadFromLink rl=new ReadFromLink(ln,s1,s2);
                        rf.start();
                        rl.start();
            }
}
