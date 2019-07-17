import java.awt.*;
import java.awt.event.*;
class MyListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Hello");
	}
}
class Test
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(200,200);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		MyListener ml=new MyListener();
		Button b=new Button("Click");
		b.addActionListener(ml);
		f.add(b);
		f.setVisible(true);
		
	}
}