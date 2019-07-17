import java.awt.*;
class Applet4
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(600,400);
		Panel p=new Panel(new GridLayout(4,4));
		BorderLayout bl=new BorderLayout();
		TextField t=new TextField();
		f.setLayout(bl);
		Button b1=new Button("1");
		Button b2=new Button("2");
		Button b3=new Button("3");
		Button b4=new Button("+");
		Button b5=new Button("4");
		Button b6=new Button("5");
		Button b7=new Button("6");
		Button b8=new Button("-");
		Button b9=new Button("7");
		Button b10=new Button("8");
		Button b11=new Button("9");
		Button b12=new Button("*");
		Button b13=new Button("C");
		Button b14=new Button("0");
		Button b15=new Button("/");
		Button b16=new Button("=");
		p.add(b1);
		p.add(b2);
		p.add(b3);
	 	p.add(b4);
		p.add(b5);
	 	p.add(b6); 
	   	p.add(b7);
   		p.add(b8);
   		p.add(b9);
		p.add(b10);
		p.add(b11); 
		p.add(b12);
		p.add(b13);
		p.add(b14); 
	  	p.add(b15);
	  	p.add(b16);
		f.add(t,BorderLayout.NORTH);
		f.add(p);
		f.setVisible(true);
	}
}
		
		