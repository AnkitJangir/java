import java.io.*;
import java.util.*;
class mull2
{
	public static void main(String args[])
	{
		vector vc=new vector();
		Console con=System.console();
		System.out.print("Enter folder : ");
		String s1=con.readLine();
		ReadFromFile rf=new ReadFromFile(vc,s1);
		System.out.print("Enter Destination foldername :");
		String s2=con.readLine();
                File f=new File(s2);
                f.mkdir();
		ReadFromVector rl=new ReadFromVector(vc,s1,s2);
		rf.multiThreadRead(1);
		rl.multiTh(1);
	}
}