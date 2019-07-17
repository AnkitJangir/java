import java.awt.*;
import java.awt.event.*;
class ReplaceFrame
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(400,400);
		f.setVisible(true);
		Panel p1=new Panel();
		Label l1=new Label("Find");
		TextField t1=new TextField(5);
		Label l2=new Label("Replace with");
		TextField t2=new TextField(5);
		Panel p2=new Panel();
		Button b1=new Button("Find Next");
		Button b2=new Button("Replace");
		Button b3=new Button("Replace All");
		Button b4=new Button("close");
		f.add(p2,"South");
		p2.add(b1);	p2.add(b2);	p2.add(b3);	p2.add(b4);	
		f.add(p1,"North");	p1.add(l1);	p1.add(t1);	p1.add(l2);	p1.add(t2);
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(1);
			}
		});
		
	}
}