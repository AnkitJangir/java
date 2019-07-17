import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b;
	MyFrame(String title)
	{
		super(title);
		l1=new JLabel("Value 1");
		l2=new JLabel("Value 2");
		l3=new JLabel("Result");
		t1=new JTextField("     ");
		t2=new JTextField("		");
		t3=new JTextField("		");
		b=new JButton();
		b.addActionListener(this);
		l1.setBounds(20,20,70,30);
		l2.setBounds(20,60,70,30);
		l3.setBounds(20,100,70,30);
		t1.setBounds(100,20,120,30);
		t2.setBounds(100,60,120,30);
		t3.setBounds(100,100,120,30);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		setVisible(true);
		setLayout(new FlowLayout());
	}
	public void actionPerformed(ActionEvent e)
	{
		String str1=t1.getText();
		String str2=t2.getText();
		int x=Integer.parseInt(str1);
		int y=Integer.parseInt(str2);
		int z=x+y;
		String res=String.valueOf(z);
		t3.setText(res);
		
	}
	public static void main(String args[])
	{
		new MyFrame("Ankit");
	}
}