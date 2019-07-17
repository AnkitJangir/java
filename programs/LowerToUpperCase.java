import java.io.*;
class LowerToUpperCase
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("Ankur.java");
		//BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("Ankit.java");
		//BufferedOutputStream bos=new BufferedOutputStream(fos);
		File f=new File("Ankur.java");
		if(!f.exists())
		{
			System.out.println("Source file not exist");
		}
		File f2=new File("Ankit.java");
		if(!f2.exists())
		{
			f2.createNewFile();
		}
		
		int ch;
		while((ch=fis.read())!=-1)
		{
			if(Character.isUpperCase(ch))
			{
				Character.toLowerCase(ch);
				fos.write(ch);
			}
		}
		fis.close();
		fos.close();
	}
}