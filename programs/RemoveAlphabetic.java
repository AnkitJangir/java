import java.io.*;
class RemoveAlphabet
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("ReadFile.java");
		FileOutputStream fos=new FileOutputStream("ReadFile.java");
		int ch;
		while((ch=fis.read())!=-1)
		{
			if(Character.isAlphabetic(ch))
			{
				fis.remove(ch);
			}
			fos.write(ch);
		}
		fis.close();
		fos.close();
	}
}