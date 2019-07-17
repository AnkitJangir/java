import javax.swing.*;
import java.awt.*;
class Abc extends JFrame
{
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4;
	Abc()
	{
		t1=new JTextField("                      ");
		t2=new JTextField("                     ");
		t3=new JTextField("                       ");
		l1=new JLabel("Number - 1");
		l2=new JLabel("Number - 2");
		l3=new JLabel("Result");
		b1=new JButton("ADD");
		b2=new JButton("SUBTRACT");
		b3=new JButton("MULTIPLY");
		b4=new JButton("DEVIDE");
		t1.setBounds(100,20,120,30);
		t2.setBounds(100,60,120,30);
		t3.setBounds(100,100,120,30);
		l1.setBounds(20,20,70,30);
		l2.setBounds(40,60,70,30);
		l3.setBounds(60,100,70,30);
		b1.setBounds(120,180,120,30);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		t3.setEditable(false);
		setSize(400,500);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
	}
	public static void main(String args[])
	{
		new Abc();
	}
}