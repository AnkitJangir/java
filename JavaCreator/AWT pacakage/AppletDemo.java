import java.awt.*;
import java.applet.*;
public class AppletDemo extends java.applet.Applet 
{
     public void init()
     {
     	Label l=new Label("Enter name");
     	add(l);
     	TextField t=new TextField();
     	add(t);
      	/*Button b1=new Button();
     	add(b1);*/
       	Button b=new Button("Click");
     	add(b);
     /*	b.getLabel();
		b.setLabel("Ok");
     	//Label l1=new Label();
     	//add(l1);
     	Label l2=new Label("Ankit",Label.RIGHT);
     	add(l2);
     	l2.getText();
     	Button b2=new Button();
     	add(b2);
     //	l2.setText("Neha");
     	if(l2.getAlignment()==Label.CENTER)
     		System.out.println("25");
     	TextField t2=new TextField("Vibha");
     	add(t2);
     	TextField t3=new TextField(25);
     	add(t3);
     	TextField t4=new TextField("Vibha Sharma",25);
     	add(t4);
     	t4.setText(t4.getText()+"cd");
     	t4.getSelectionStart();
     	t4.getSelectionEnd();
     	t4.select(1,5);
     	t4.setVisible(false);
     	t4.setVisible(true);
     	t4.setEditable(false);
     	t4.selectAll();
     	if(t4.isEditable()==true)
     		t4.setEditable(false);
     	t4.setEchoChar('#');
     	t4.getEchoChar();*/
     	TextArea t1=new TextArea();
     	add(t1);
     	TextArea t2=new TextArea("Ankit jangir",5,10,TextArea.SCROLLBARS_BOTH);
     	add(t2);
     	TextArea t3=new TextArea(5,10);
     	add(t3);
     	TextArea t4=new TextArea("Hello World ",5,10,TextArea.SCROLLBARS_BOTH);
     	add(t4);
     	/*t2.appendText("Vibha Sharma");
     	t2.insertText("Rahul KUmawat",2);
     	t2.replaceText("AJ",2,5);
     	t2.getRows();
     	String ss;
     	ss=t4.getSelectedText();
     	System.out.println("The NO"+ss);*/
     	
     }
}
//<applet code="AppletDemo.class" width="400" height="455"></applet>