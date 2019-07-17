import java.awt.*;
import java.awt.event.*;
class Demo implements MouseMotionListener
{
	Frame f;	Panel p;	Label l1,l2;	TextField t1,t2;
	public Demo()
	{
		f=new Frame();	f.setSize(400,300);		f.setVisible(true);
		f.addMouseMotionListener(this);
		p=new Panel();
		l1=new Label("X");	l2=new Label("Y");
		t1=new TextField(5);	t2=new TextField(5);
		p.add(l1);	p.add(t1);	p.add(l2);	p.add(t2);	
		f.add(p,"South");
	}		
	public void mouseMoved(MouseEvent e1)
	{
		int x,y;
		x=e1.getX();	y=e1.getY();
		t1.setText(x+"");	t2.setText(y+"");		
	}
	public void mouseDragged(MouseEvent e2)
	{		
	}
	public static void main(String args[])
	{
		Demo d=new Demo();
	}
}