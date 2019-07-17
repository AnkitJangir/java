import java.awt.*;
class DemoCardLayout
{
	public static void main(String args[])
	{
		Frame f=new Frame ();
		f.setSize(500,300);
		f.setVisible(true);
		CardLayout cl=new CardLayout();
		f.setLayout(cl);
		Button b1=new Button("java");
		f.add(b1,"sun");
		Button b2=new Button ("Hive");
		f.add(b2,"apache");
		Button b3=new Button ("VB");
		f.add(b3,"MS");
		cl.last(f);
		cl.first(f);
		cl.next(f);
		cl.previous(f);
		cl.show(f,"apche");
		
	}
}