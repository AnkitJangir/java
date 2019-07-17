import java.awt.*;
class MyFrame extends Frame
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillRect(10,12,300,250);
		g.setColor(Color.green);
		g.fillRect(40,50,100,80);
		g.drawLine(10,12,80,68);
		g.drawRect(50,100,80,68);
		g.drawOval(50,100,80,68);
		g.drawOval(50,70,40,40);
		g.drawArc(100,120,100,80,45,135);
		int x[]={50,112,220,148,9};
		int y[]={41,27,112,205,132};
		g.drawPolygon(x,y,5);
		g.drawString ("Hello",140,112);
		g.setColor(Color.red);
		g.setFont(new Font("Arial",Font.ITALIC,12));
		
	}
	public void someOtherMethod()
	{
		Graphics g=getGraphics();
		g.setColor(Color.red);
		g.fillRect(10,12,300,250);
		g.setColor(Color.green);
		g.fillRect(40,50,100,80);
	}
	public static void main(String args[])
	{
		MyFrame f=new MyFrame();
		f.setSize(400,400);
		f.setVisible(true);
	}
}