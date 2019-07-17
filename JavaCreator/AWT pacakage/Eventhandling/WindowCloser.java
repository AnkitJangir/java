import java.awt.*;
import java.awt.event.*;
public class WindowCloser extends  WindowAdapter
{
	public void windowClosing (WindowEvent e)
	{
		Window w=e.getWindow();
		w.setVisible(true);
		w.dispose();
		System.exit(1);
	}
	public void windowClosed(WindowEvent ev)
	{
		Window w=ev.getWindow();
		w.setVisible(true);
		w.dispose();
		System.exit(1);
	}
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(400,500);
		f.setBackground(Color.red);
		WindowCloser wc=new WindowCloser();
		f.addWindowListener(wc);
		f.setVisible(true);
	}
}