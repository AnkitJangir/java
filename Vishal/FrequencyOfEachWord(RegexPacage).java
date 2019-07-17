

import java.util.*;
import java.io.*;
class Sc
{
	 public static void main(String as[]) throws IOException
             {
     		Console con = System.console();
                 HashSet set= new  HashSet();
                 HashMap map = new HashMap();
                   System.out.print("Enter the file name");
                   String str = con.readLine();
                   StreamTokenizer st= new StreamTokenizer(new FileInputStream(str));

                       while(st.nextToken() != StreamTokenizer.TT_EOF)
                         {
                           String s;
                           switch(st.ttype)
                           {
                              case StreamTokenizer.TT_EOL:
                                   s= "EOL"+"";
                                    break;
                              case StreamTokenizer.TT_NUMBER:
                                  s=st.nval+"";
                                    break;
                              case StreamTokenizer.TT_WORD:
                                  s=st.sval+"";
                                     break;
                               default:
                                       s = ""+((char)st.ttype);
                          }  
                   
                       if (map.containsKey(s))
                           {
                                  int  count =((Integer)(map.get(s))).intValue()+1;
                                   map.put(s,count);
                           }
                           else
                           {
                              map.put(s,new Integer(1)); 
                            }
                          set.add(s);
                        }
              System.out.println("Word in the file"+"\n"+str);

                       for(Object obj:  set)
                              System.out.println((String)obj+"\t"+map.get(obj));
                }
}                     