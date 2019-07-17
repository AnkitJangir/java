import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class a
{
	JFrame f;
	JButton b;
	JLabel l;
	a()
	{
		f=new JFrame();
		b=new JButton("Click:");
		JTextField t=new JTextField("   ");
		JTextField t2=new JTextField("  ");
		f.setSize(400,500);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
	/*	t.setBounds(10,20,20,10);
		t2.setBounds(20,30,10,20);*/	
		f.add(b);
		f.add(t);
		f.add(t2);
		
	}
	public static void main(String args[])
	{
		new a();
	}
}