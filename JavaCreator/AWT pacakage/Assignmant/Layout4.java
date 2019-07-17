import java.awt.*;
class Layout4
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(400,300);
		f.setLayout(new BorderLayout());
		BorderLayout bl2=new BorderLayout();
		f.setLayout(bl2);
		Panel p1=new Panel();
		p1.add(new Scrollbar(Scrollbar.VERTICAL,25,5,0,100));
		BorderLayout bl=new BorderLayout(2,3);
		f.add(p1,BorderLayout.EAST);
		f.setLayout(bl);
		Panel p2=new Panel();
		p2.add(new Scrollbar(Scrollbar.VERTICAL,24,4,0,50));
		f.add(p2,BorderLayout.EAST);
		Panel p3=new Panel();
		p3.add(new Scrollbar(Scrollbar.VERTICAL,30,10,0,200));
		f.add(p3,BorderLayout.EAST);
		
		
		
		
		
		
		f.setVisible(true);
	}
}