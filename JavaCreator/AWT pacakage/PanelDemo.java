import java.awt.*;
class PanelDemo
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(400,300);
		f.setLayout(new FlowLayout());
		Panel p1=new Panel();
		p1.setBackground(Color.red);
		Panel p2=new Panel();
		p2.setBackground(Color.green);
		Label l=new Label("Enter name");
		TextField t=new TextField(20);
		Button b1=new Button("Ok");
		Button b2=new Button("Cancel");
		p1.add(l);
		p1.add(t);
		p2.add(b1);
		p2.add(b2);
		f.add(p1);
		f.add(p2);
		f.setVisible(true);
		FlowLayout fl=new FlowLayout(FlowLayout.LEFT,10,20);
		f.setLayout(fl);
		GridLayout gl=new GridLayout(4,3);
		f.setLayout(gl);
		//BorderLayout bl=new BorderLayout();
		//f.setLayout(bl);
		//f.add(b1,"North");
		//f.add(b1,BorderLayout.NORTH);
	}
}