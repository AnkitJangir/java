import java.awt.*;
import java.awt.event.*;
class Demo implements ActionListener
{
	Frame f;
	Button b1,b2,b3;
	TextField t;
	public Demo()
	{
		f=new Frame();
		f.setSize(400,300);
		f.setLayout(new FlowLayout());
		t=new TextField(10);
		b1=new Button("One");
		b1.addActionListener(this);
		b2=new Button("Two");
		b2.addActionListener(this);
		b3=new Button("Three");
		b3.addActionListener(this);
		f.add(b1);  f.add(b2); f.add(b3); f.add(t);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		if(str.equals("One"))
			t.setText("C++");
		else if(str.equals("Two"))
			t.setText("Java");
		else
			t.setText("Oracle");
	}
	public static void main(String args[])
	{
		Demo d=new Demo();
	}
}