import java.awt.*;
import java.awt.event.*;
import java.io.*;
class a implements ActionListener
{
	Frame f,f2;
	MenuBar mb;
	Menu m1,m2,m3;
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2,b3,b4;
	MenuItem nw,op,sv,svs,ext,fnd,fndr;
	TextArea ta;
	FileDialog fd;
	String name,path,n;
	int count=0;
	boolean flag;
	public a()
	{
		f=new Frame();
		f.setSize(500,500);
		mb=new MenuBar();
		m1=new Menu("file");
		m2=new Menu("Toos");
		ta=new TextArea();
		f.add(ta);
		nw=new MenuItem("New");
		op=new MenuItem("OPen");
		sv=new MenuItem("Save");
		svs=new MenuItem("Save As");
		fnd=new MenuItem("find");
		fndr=new MenuItem("Find  and Replace");
		fd=new FileDialog(f,"Save As",FileDialog.SAVE);
		nw.addActionListener(this);
		op.addActionListener(this);
		sv.addActionListener(this);
		svs.addActionListener(this);
		ext.addActionListener(this);
		fnd.addActionListener(this);
		fndr.addActionListener(this);
		m1.add(nw);m1.add(op);m1.add(sv);m1.add(svs);m1.addSeparator();m1.add(ext);
		m2.add(fnd);m2.add(fndr);
		GridLayout gl=new GridLayout(3,0);
		f2=new Frame("find");
		f2.setSize(300,200);
		f2.setLayout(gl);
		Label l1=new Label("find");
		TextField tf=new TextField(10);
		Panel p=new Panel();
		Button b1=new Button ("find next");
		Button b2=new Button ("close");
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae1)
			{
				f2.setVisible(false);
				f2.dispose();
			}
		});
		p.add(b1);
		p.add(b2);
		f2.add(l1);f2.add(tf);f2.add(p);
		mb.add(m1);
		mb.add(m2);
		f.setMenuBar(mb);
		f.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			String str=e.getCommmand();
			MenuItem mi=(MenuItem)e.getSource();
			if(mi==nw)
			{
				ta.setText("");
				sv.setEnabled(true);
				
			}
			else if(mi==op)
			{
				fd=new FileDialog(f,"Open",FileDialog.LOAD);
				fd.setVisible(true);
				name=fd.getFile();
				path=fd.getDirectory();
				n=path+name+"";
				File fl=new File(path,name);
				FileInputStream fis=new FileInputStream(fl);
				int ch;
				ta.setText("");
				while((ch=fis.read())!=-1)
				{
					ta.appendText((char)ch+"");
					
				}
				sv.setEnabled(true);
				fis.close();
				f.setTitle(fd.getFile()+"-Notepad");
				
			}
			else if(mi==sv)
			{
				fd=new FileDialog(f,"Save",FileDialog.SAVE);
				if(flag==false)
				{
					fd.setVisible(true);
					name=fd.getFile();
					path=fd.getDirectory();
					File f=new File(path,name);
					//f.createNewFile();
					String str1=ta.getText();
					FileOutputStream fos=new FileOutputStream(f);
					char arr[];
					arr=str1.toCharArray();
					for(int i=0;i<arr.length;i++)
					{
						fos.write(arr[i]);
						
					}
					fos.close();
					
				}
				else
				{
					System.out.println(n);
					/*name=fd.getFile();
					path=fd.getDirectory();
					File f=new File(path,name);*/
					String str1=ta.getText();
					File f=new File(n);
					FileOutputStream fos=new FileOutputStream(f);
					char arr[];
					arr=str1.toCharArray();
					for(int i=0;i<arr.length;i++)
					{
						fos.write(arr[i]);
						
					}
					fos.close();					
				}
			}
			else if(mi==svs)
			{
				fd=new  FileDialog(f,"Save As",FileDialog.SAVE);
				fd.setVisible(true);
				name=fd.getFile();
				path=fd.getDirectory();
				File f=new File(path,name);
				String str1=ta.getText();
				FileOutputStream fos=new FileOutputStream(f);
				char arr[];
				arr=str1.toCharArray();
				for(int i=0;i<arr.length;i++)
				{
					fos.write(arr[i]);
				}
				fos.close();
				
				
			}
			else if(mi==ext)
			{
				f.setVisible(false);
				f.dispose();
				System.exit(1);
				
			}
			else if(mi==fnd)
			{
				f2.setVisible(true);
			}
			else if(mi==fndr)
			{
				
			}
		}
		catch(Exception ex)
		{
			ex.getMessage();
		}
	}
	public void textValueChanged(TextEvent te)
	{
		sv.setEnabled(true);
		flag=true;
	}
	public static void main(String args[])
	{
		a a1=new a();
	}
}