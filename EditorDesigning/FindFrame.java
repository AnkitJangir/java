import java.awt.*;
import java.awt.event.*;
class Find
{
	public static void main(String args[])
	{
	
		Frame f=new Frame();
		Window 	w;
		f.setSize(500,400);
		f.setVisible(true);
		Panel p1=new Panel();
		Label l=new Label("Find",Label.LEFT);
		TextField t=new TextField(5);
		Panel p2=new Panel();
		Button b1=new Button("Find Next");
		Button b2=new Button("Close");
		f.add(p2,"South");
		p2.add(b1);
		p2.add(b2);
		f.add(p1,"North");
		p1.add(l);
		p1.add(t);
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(1);
			}			
		});
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent ev)
			{
				Window w=ev.getWindow();
				w.setVisible(true);
				w.dispose();
				System.exit(1);
			}
		});
	}
}	