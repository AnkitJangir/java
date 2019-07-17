import java.awt.*;
class Ankit
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(500,400);
		f.setLayout(new FlowLayout());
		FlowLayout fl=new FlowLayout(FlowLayout.LEFT,10,20);
		f.setLayout(fl);
		f.setVisible(true);
		TextField tf=new TextField("1");
		f.add(tf);
		
	}
}