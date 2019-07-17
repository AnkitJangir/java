import java.io.*;
class FileMethods
{
	public static void main(String args[]) throws IOException
	{
		Console con=System.console();
		File f=new File("F:/JavaCreator/NotesProgrames/Money/Money.java");
		System.out.println(f.exists());		// To know the file (path in the File object) is exist or not
		System.out.println(f.isFile());		// to know is it the file or not?????????
		System.out.println(f.isDirectory());	// to know is it the directory or not????
		System.out.println(f.canRead());		// To know can We read the file or not???????????
		System.out.println(f.canWrite());		// To know can we write on the file or not????????
		System.out.println(f.canExecute());		//To know can I execut the file????????????
		if(f.exists())
		{
			System.out.println("Size is::"+f.length());		//To get the size of the file in term of bytes 
		}
		System.out.println();
		System.out.println();
		System.out.println(f.getName());		// To find the name of File 
		System.out.println(f.getParent());		// To find the path by lefting the file name 
		System.out.println(f.getPath());		// To find the path name of the file or directory
		
		/////////////// To get the  list of String of giving directory////////////////
		
		
		/*String s1;
		System.out.println("Enter the directory name");
		s1=con.readLine();*/
		File f1=new File("F:/JavaCreator/NotesProgrames/IOPackage");
		if(f1.exists())
		{
			String arr[];
			arr=f1.list();		//It contained the files and other directory
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println();
		System.out.println();
		
		
		////////////// To get an array of File object in the giving directory//////////////////
		if(f1.exists())
		{
			File arr[];
			arr=f1.listFiles();
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i].isFile())
				{
					System.out.println(arr[i].getName()+"<file>");
				}
				else
				{
					System.out.println(arr[i].getName()+"<directory>");
				}
			}
		}
		
		File f2=new File("F:/JavaCreator/NotesProgrames/IOPackage/CopyFile.java");
		if(!f2.exists())
		{
			f2.createNewFile();		//to create a new File if it exists ,it returns false
		}
		
		File f3=new File("F:/JavaCreator/NotesProgrames/IOPackage/A");
		if(!f3.exists())
		{
			f3.mkdir();		/// To create a directory if it succeded , it returns true
		}
		File f4=new File("F:/JavaCreator/NotesProgrames/IOPackage/A/a");
		if(!f4.exists())
		{
			f4.mkdirs();		/// To create the directory hierarchy if it succeded , it reutns true
		}
		
		if(f4.exists())
		{
			f4.delete();		/// To delete the file or directory
		}
		f3.delete();
		
		File f5=new File("F:/JavaCreator/NotesProgrames/IOPackage/A.java");
		f5.createNewFile();
		File f6=new File("F:/JavaCreator/NotesProgrames/IOPackage/AA.java");
		f5.renameTo(f6); 		// To rename or move the file
	}
}
