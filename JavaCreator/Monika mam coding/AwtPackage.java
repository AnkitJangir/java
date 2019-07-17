import javax.swing.*;
import java.awt.*;
class MyFrame extends JFrame
{
	JLabel l1,l2,l3;
	MyFrame(String title)
	{
		super(title);
		l1=new JLabel("One");
		l2=new JLabel("Two");
		l1.setBounds(50,100,40,50);
		l2.setBounds(444,220,30,10);
		add(l1);
		add(l2);
		setSize(400,500);
		setVisible(true);
		setLayout(new FlowLayout());
	}
	public static void main(String args[])
	{
		new MyFrame("Ankit");
	}
}