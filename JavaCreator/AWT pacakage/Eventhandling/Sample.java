import java.awt.*;
import java.awt.event.*;
class Sample
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(400,300);
		f.setLayout(new FlowLayout());
		MyListener ml=new MyListener();
		Button b1=new Button("One");
		b1.addActionListener(ml);
		Button b2=new Button("Two");
		b2.addActionListener(ml);
		Button b3=new Button("Three");
		b3.addActionListener(ml);
		f.add(b1); f.add(b2);  f.add(b3);
		f.setVisible(true);
		
	}
}
class MyListener implements ActionListener 
{
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		if(str.equals("One"))
			System.out.println("C++");
		else if(str.equals("Two"))
			System.out.println("Java");
		else
			System.out.println("Oracle");
	}
}