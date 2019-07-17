import java.io.*;
class BufferedIO
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("CopyFile.java");
		BufferedInputStream bis=new BufferedInputStream(fis,1024);
		FileOutputStream fos=new FileOutputStream("b.java");
		BufferedOutputStream bos=new BufferedOutputStream(fos,512);
		int ch;
		while((ch=bis.read())!=-1)
		{
			bos.write(ch);
		}
		bis.close();
		bos.close();
	}
}