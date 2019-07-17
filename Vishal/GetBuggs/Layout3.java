import java.awt.*;
import java.awt.event.*;
class Layout3 implements AdjustmentListener
{
	Frame f;
	Panel p1,p2,p3;
	Label r,b,g;
	TextField t1,t2,t3;
    Scrollbar sb1,sb2,sb3;
     public Layout3()
	{
	   f=new Frame();
	  p1 = new Panel(new FlowLayout());
	  p2 = new Panel(new GridLayout(0,3));
      p3 = new Panel(new BorderLayout()); 
	  BorderLayout bb= new BorderLayout();

	    f.setSize(400,300);
	    f.setLayout(bb);
	    f.setVisible(true);
	   r = new Label("Red");
	   t1 = new TextField(4);
	   b = new Label("Blue");
	   t2 = new TextField(4);
	   g = new Label("Green");
	   t3 = new TextField(4);

	   p1.add(r);p1.add(t1);
	   p1.add(b);p1.add(t2);
	   p1.add(g);p1.add(t3); 

	    sb1=new Scrollbar(Scrollbar.VERTICAL,0,5,0,300);
        sb1.addAdjustmentListener(this);
	    sb1.setValue(70);
	    sb1.setBackground(Color.red);
	    sb2=new Scrollbar(Scrollbar.VERTICAL,0,5,0,300);
	    sb2.addAdjustmentListener(this);
	    sb2.setValue(20);
	    sb2.setBackground(Color.yellow);
	    sb3=new Scrollbar(Scrollbar.VERTICAL,0,5,0,300);
	    sb3.addAdjustmentListener(this);
	    sb3.setValue(40);
	    sb3.setBackground(Color.cyan);
         
	   p2.add(sb1);
	   p2.add(sb2);
	   p2.add(sb3);

	   f.add(p2,BorderLayout.EAST);
       f.add(p1,"South");
       f.add(p3,"Center");
   }

       public void adjustmentValueChanged(AdjustmentEvent e)
       {
       	int value;
       	value=sb1.getValue();
       	t1.setText(value+"");

       	int value2;
       	value2=sb2.getValue();
       	t2.setText(value2+"");
       	
       	int value3;
       	value3=sb3.getValue();
       	t3.setText(value3+"");
       	
       	Color mycolor = new Color(value,value2,value3);
       	p3.setBackground(mycolor);
       	
       }
       public static void main (String args[])
       {
            Layout3  d = new Layout3();      	
       }

    
}//  String str =e.getActionCommand();
            // t.setText(t.getText()+str);
