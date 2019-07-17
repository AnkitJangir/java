import java.awt.*;
import java.awt.event.*;
class Demo implements AdjustmentListener
{
	Frame f;
	Scrollbar sb;
	Panel p;
	Label l;
	TextField t;
	public Demo()
	{
		f=new Frame ();
		f.setSize(200,200);
		sb=new Scrollbar(Scrollbar.VERTICAL,0,5,0,300);
		sb.addAdjustmentListener(this);
		sb.setBackground(Color.black);
		sb.setForeground(Color.white);
		p=new Panel();
		l=new Label("Value");
		t=new TextField(5);
		p.add(l);
		p.add(t);
		f.add(p,"South");
		f.add(sb,"East");
		f.setVisible(true);	
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		int value;
		value=sb.getValue();
		t.setText(value+"");	
	}
	public static void main(String args[])
	{
		Demo d=new Demo();
	}
}