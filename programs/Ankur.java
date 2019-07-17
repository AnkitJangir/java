import java.io.*;
class AnkitJangir
{
public static void main(String args[])
{
int a=4,b=7;
if(a>5&b++<10)

System.out.println("X");
else
System.out.println("Y");
System.out.println(b);
}
}
class ReadFile
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("F:/Java Programs/Interface And Abstract/Libraray/Item.java");
		int ch;
		while((ch=fis.read())!=-1)
		{
			System.out.println((char)ch);
		}
		fis.close();
	}
}
