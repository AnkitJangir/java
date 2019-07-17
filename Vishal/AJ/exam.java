import java.awt.*;
import java.awt.event.*;
class MySc implements AdjustmentListner
{
	Fram f;
	Scrollbar sb; Panel p; Label l;TextField t;
	public MySc()
	{

	f=new Frame();
	f.setSize(400,400);
	p=new Panel(); sb=new Scrollbar(Scrollbar.VERTICAL,0,5,300);
	t=new TextField(5); sb.addAdjustmentListener(this);
	f.add(p,"South"); l=new Label("Value");
	f.setVisible(true); p.add(l);p.add(t);
	f.add(sb,"East");
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
	  int value;
	  value=sb.getValue();
	  t.setText(value+"");
	}

	
	public static void main(String args[])
	{
	
			MySc d=new MySc();
	}	

}
