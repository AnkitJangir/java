import java.awt.*;
class Demo
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(200,100);
		f.setVisible(true);
		FileDialog fd=new FileDialog(f,"SELECT",FileDialog.LOAD);
		fd.setVisible(true);
		String path,name;
		name=fd.getFile();
		path=fd.getDirectory();
		System.out.println("U have selected "+name+"in"+path);
	}
}