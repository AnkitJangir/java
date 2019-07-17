import javax.swing.*;
import java.awt.*;
class ScrollPaneDemo extends JFrame
{
	String a[]={"Ankit","Yami","Raj"};
	JList l;
	JComboBox cb;
	JScrollPane sp;
	ScrollPaneDemo(String name)
	{
		super(name);
		l=new JList(a);
		cb=new JComboBox(a);
		sp=new JScrollPane(l);
		add(l);
		add(cb);
		add(sp);
		cb.addItem("Ekku");
		setSize(400,500);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setVisible(true);
	}
	public static void main(String args[])
	{
		ScrollPaneDemo sdd= new ScrollPaneDemo("Hello");
	}
}