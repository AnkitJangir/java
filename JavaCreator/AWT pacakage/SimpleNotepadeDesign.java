import java.awt.*;
import java.awt.event.*;
class MenuDemo implements ActionListener
{
	Frame f;
	MenuBar mb;
	Menu m1,m2,m3;
	MenuItem nw,opn,sve,ext,ct,cpy,pst;
	CheckboxMenuItem bld,itlc;
	public MenuDemo()
	{
		f=new Frame ();
		f.setSize(500,400);
		f.setLayout(new FlowLayout());
		mb=new MenuBar();
		m1=new Menu("File");
		m2=new Menu("Edit");
		m3=new Menu("Others");
		nw=new MenuItem("New");
		opn=new MenuItem("Open");
		sve=new MenuItem("Save");
		ext=new MenuItem("Exit");
		ct=new MenuItem("Cut");
		cpy=new MenuItem("Copy");
		pst=new MenuItem("Paste");
		nw.addActionListener(this);
		opn.addActionListener(this);
		sve.addActionListener(this);
		ext.addActionListener(this);
		ct.addActionListener(this);
		cpy.addActionListener(this);
		pst.addActionListener(this);
		bld=new CheckboxMenuItem("Bold");
		itlc=new CheckboxMenuItem("Italic");
		itlc.setState(true);
		m3.add(ct);		m3.add(cpy);	m3.add(pst);
		m2.add(bld);	m2.add(itlc);	m2.addSeparator();	m2.add(m3);
		m1.add(nw);		m1.add(opn);	m1.add(sve);		m1.addSeparator();	m1.add(ext);
		mb.add(m1);		mb.add(m2);
		f.setVisible(true);		f.setMenuBar(mb);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		System.out.println(str+"was Clicked");
	}
	public static void main(String args[])
	{
		MenuDemo d=new MenuDemo();
	}
}