import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Demo extends WindowAdapter implements ActionListener
{
	Frame f;
	MenuBar mb;
	Menu m1,m2,m3;
	MenuItem nw,opn,sve,sveas,ext,fid,rpl;
	public Demo()
	{
		f=new Frame ();
		f.setSize(500,400);
		f.setLayout(new FlowLayout());
		f.addWindowListener(this);
		mb=new MenuBar();
		m1=new Menu("File");
		m2=new Menu("Edit");
		nw=new MenuItem("New");
		opn=new MenuItem("Open");
		sve=new MenuItem("Save");
		sveas=new MenuItem("SaveAs");
		ext=new MenuItem("Exit");
		nw.addActionListener(this);
		opn.addActionListener(this);
		sve.addActionListener(this);
		sveas.addActionListener(this);
		ext.addActionListener(this);
		fid=new MenuItem("find");
		rpl=new MenuItem("Replace");
		m2.add(fid);	m2.add(rpl);	
		m1.add(nw);		m1.add(opn);	m1.add(sve);	m1.add(sveas);		m1.addSeparator();		m1.add(ext);
		mb.add(m1);		mb.add(m2);
		f.setVisible(true);		f.setMenuBar(mb);
	}
	public void windowClosing(WindowEvent ev)
	{
		Window	w=ev.getWindow();
		w.setVisible(true);
		w.dispose();
		System.exit(1);
	}
	public void windowClosed(WindowEvent ev1)
	{
		Window	w=ev1.getWindow();
		w.setVisible(true);
		w.dispose();
		System.exit(1);
	}
	/*public void windowActivated(WindowEvent ev2)
	{
		Window	w=ev2.getWindow();
		w.setVisible(true);
		w.dispose();
	}
	public void windowDeactivated(WindowEvent ev3)
	{
		Window	w=ev3.getWindow();
		w.setVisible(true);
		w.dispose();
	}*/
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource()==nw)
			{
				FileDialog fd=new FileDialog(f,"SELECT",FileDialog.SAVE);
				fd.setVisible(true);
				String path,name;
				name=fd.getFile();
				path=fd.getDirectory();
				File f1=new File(name,path);
				if(!f1.exists())
				{
					f1.createNewFile();
				}
			}		
		}
		catch(IOException e1)
		{
			System.out.println(e1.getMessage());
		}
		try
		{
			if(e.getSource()==opn)
			{
				FileDialog fd1=new FileDialog(f,"SELECT",FileDialog.LOAD);
				fd1.setVisible(true);
				String path,name;
				name=fd1.getFile();
				path=fd1.getDirectory();
				File f2=new File(name,path);
				FileInputStream fis=new FileInputStream(f2);
				BufferedInputStream bis=new BufferedInputStream(fis);
				File f3=new File("A.java");
				if(!f3.exists())
				{				
					f3.createNewFile();
				}
				FileOutputStream fos=new FileOutputStream(f3);
				BufferedOutputStream bos=new BufferedOutputStream(fos);
				int ch;
				while((ch=bis.read())!=-1)
				{
					bos.write(ch);
				}
				bis.close();
				bos.close();
			}
		}
		catch(IOException e5)
		{
			System.out.println(e5.getMessage());
		}
		try
		{
			if(e.getSource()==sve)
			{
				FileDialog fd=new FileDialog(f,"SELECT",FileDialog.SAVE);
				fd.setVisible(true);
				String path,name;
				name=fd.getFile();
				path=fd.getDirectory();
				File f1=new File(name,path);
				if(!f1.exists())
				{
					f1.createNewFile();
				}
			}		
		}
		catch(IOException e1)
		{
			System.out.println(e1.getMessage());
		}
		/*try
		{
			if(e.getSource()==sveas)
			{
				
			}
		}
		catch(IOException e1)
		{
			System.out.println(e1.getMessage());
		}*/
		if(e.getSource()==ext)
		{
			System.exit(0);
		}
		String str=e.getActionCommand();
		System.out.println(str+"was Clicked");
	}
	
	
		
	
	
	
	public static void main(String args[])
	{
		Demo d=new Demo();
	}
}
