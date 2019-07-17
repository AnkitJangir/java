import javax.swing.*;
import java.awt.*;
class CheckBox extends JFrame
{
	JLabel l1,l2;
	JTextField t1,t2;
	JCheckBox ch1,ch2;
	CheckBox(String title)
	{
		super(title);
	 	l1=new JLabel("Ankit");
	 	l2=new JLabel("Raj");
	 	t1=new JTextField("          ");
	 	t2=new JTextField("          ");
	 	ch1=new JCheckBox();
	 	ch2=new JCheckBox();
	 	add(ch1);
	 	add(l1);
	 	add(t1);
	 	add(ch2);
	 	add(l2);
	 	add(t2);
	 	setSize(400,500);
	 	setLayout(new FlowLayout());
	 	setVisible(true);
	} 
	public static void main(String args[])
	{
		CheckBox ch=new CheckBox("Ankit");
	}
}