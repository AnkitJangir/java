import java.awt.*;
class CardLayoutDemo
{
	public static void main(String arsgs[])
	{
		Frame f=new Frame();
		f.setSize(400,500);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		Button b1=new Button("OK");
		f.add(b1);
		Frame f1=new Frame();
		f1.setSize(200,211);
		f1.setLayout(new FlowLayout());
		Button b2=new Button("CANCEL");
		f1.add(b2);
		f1.setVisible(true);
	}
}