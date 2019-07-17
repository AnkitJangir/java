import java.awt.*;
import java.applet.*;
public class GraphicsDemo extends Applet
{
	//Graphics g=new Graphics();
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillRect(10,12,300,250);
		g.setColor(Color.green);
		g.fillRect(40,50,100,80);
	}
}
//<applet code="GraphicsDemo.class" width=600 height=500></applet>