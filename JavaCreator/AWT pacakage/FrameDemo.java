import java.awt.*;
class FrameDemo
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(400,300);
		f.setLayout(new FlowLayout());
		Label l=new Label("Name");
		f.add(l);
		TextField t=new TextField(20);
		f.add(t);
		Button b1=new Button("ok");
		f.add(b1);
		Button b2=new Button("Cancel");
		f.add(b2);
		f.setVisible(true);
		TextArea t1=new TextArea("Hello World",10,40,TextArea.SCROLLBARS_BOTH);
		f.add(t1);
		t1.appendText("\nof java");
		Choice ch=new Choice();
		ch.add("java");
		ch.add("Ankit jangir");
		ch.add("Vibha Sharma");
		f.add(ch);
		
		
	}
}