import java.awt.*;
import java.awt.event.*;
class CardLayout5 implements ActionListener
{
	Frame f1,f2;
	Panel p1,p2,p3,p4,p5,p6;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
	TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18;
	CardLayout cl=new CardLayout();
	public CardLayout5()
	{
		f1=new Frame();
		f1.setSize(1000,1000);
		p3=new Panel(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.weightx=1;
		gbc.weighty=1;
		Label l1=new Label("Name");
		p3.add(l1,gbc);
		TextField t1=new TextField(10);
		gbc.gridx=3;
		p3.add(t1,gbc);
		Label l2=new Label("surname");
		gbc.gridx=0;
		gbc.gridy=3;
		p3.add(l2,gbc);
		TextField t2=new TextField(10);
		gbc.gridx=3;
		gbc.gridy=3;
		p3.add(t2,gbc);
		Label l3=new Label("age");
		p3.add(l3,gbc);
		TextField t3=new TextField(10);
		gbc.gridx=3;
		gbc.gridy=3;
		p3.add(t3,gbc);
		Label l4=new Label("Qualification");
		p3.add(l4,gbc);
		TextField t4=new TextField(10);
		gbc.gridx=3;
		gbc.gridy=3;
		p3.add(t4,gbc);
		
		
		Panel p4=new Panel(new GridBagLayout());
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.weightx=1;
		gbc.weighty=1;
		Label l5=new Label("Home no.");
		p3.add(l5,gbc);
		TextField t5=new TextField(10);
		gbc.gridx=3;
		p3.add(t5,gbc);
		Label l6=new Label("Address");
		gbc.gridx=0;
		gbc.gridy=3;
		p3.add(l6,gbc);
		TextField t6=new TextField(10);
		gbc.gridx=3;
		gbc.gridy=3;
		p3.add(t6,gbc);
		Label l7=new Label("City");
		p3.add(l7,gbc);
		TextField t7=new TextField(10);
		gbc.gridx=3;
		gbc.gridy=3;
		p3.add(t7,gbc);
		Label l8=new Label("State");
		p3.add(l8,gbc);
		TextField t8=new TextField(10);
		gbc.gridx=3;
		gbc.gridy=3;
		p3.add(t8,gbc);
		
		
		f2=new Frame();
		f2.setSize(1000,1000);
		f2.setVisible(true);
		p1=new Panel();
		f2.add(p1,"South");
		Button b17=new Button("Back");
		Button b18=new Button("Next");
		p1.add(b17);
		p1.add(b18);
		p2=new Panel();
		//CardLayout cl=new CardLayout();
		cl.addActionListener(this);
		p2.setLayout(cl);
		f2.add(p2);	
	}
	public void actionPerformed(ActionEvent e)
	{
		cl.first(p3);
		if(e.getSource()==p3)
			cl.next(p4);
		else if(e.getSource()==p4)
			cl.next(p5);
		else
			cl.next(p6);
	}
	public static void main(String args[])
	{
		CardLayout5 cl1=new CardLayout5();
	}
}