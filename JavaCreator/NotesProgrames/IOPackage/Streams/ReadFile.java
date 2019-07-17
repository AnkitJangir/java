import java.io.*;
class ReadFile
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("F:/EditorDesigning/AnkitNotepad.java");
		int ch;
		while((ch=fis.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fis.close();
	}
}
