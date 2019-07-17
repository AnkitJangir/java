import java .io.*;
class Concatenate
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis1=new FileInputStream("F:/EditorDesigning/AnkitNotepad.java");
		FileInputStream fis2=new FileInputStream("F:/EditorDesigning/AnkitNotepad1.java");
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		FileOutputStream fos=new FileOutputStream("Ak.txt");
		int ch;
		while((ch=sis.read())!=-1)
		{
			fos.write(ch);
		}
		sis.close();
		fos.close();
	}
}


	
	