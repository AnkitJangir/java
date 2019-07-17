import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
class Notepad extends WindowAdapter implements ActionListener,TextListener
{
	JFrame f,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10; // f1 find replace
	JMenuBar mb;
	JMenu m1,m2,m3;
	JMenuItem ne,op,sa,saa,ex,fi,fir;
    JPanel p,p1,p2,p4;
    JTextArea ta,ta1;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    JLabel l1,l2,l3,l4,l5;
    int flag=0;
    int n=0,n1=0,n2=0;
    FileDialog fd;
	public Notepad()
	{
    	f=new JFrame("Untitled-Notepad"); 
        f.setSize(600,600);
	    ta = new JTextArea();
        f.add(ta);
        mb = new JMenuBar();
		m1 = new JMenu("File");
		ne = new JMenuItem("New");
        op = new JMenuItem("Open");
        sa = new JMenuItem("Save");
        saa= new JMenuItem("Save As");
        ex = new JMenuItem("Exit");
		m2 = new JMenu("Edit");
	 	fi = new JMenuItem("Find");
      	fir = new JMenuItem("Replace");
		m1.add(ne);m1.add(op);m1.add(sa);m1.add(saa);m1.addSeparator();m1.add(ex);
        mb.add(m1);
        m2.add(fi);m2.add(fir);
        mb.add(m2);
       	f.setJMenuBar(mb);
       	f.setVisible(true);
       	ne.addActionListener(this);
       	op.addActionListener(this);
       	ex.addActionListener(this);
       	sa.addActionListener(this);
       	saa.addActionListener(this);
       	fi.addActionListener(this);
       	fir.addActionListener(this);
       	f.addWindowListener(this);
       	ta.addKeyListener(new KeyAdapter()		// textarea check
       	{
       		public void keyPressed(KeyEvent k1)
    		{
    			n=ta.getCaretPosition();
        		n1=ta.getCaretPosition();
        		n2=ta.getCaretPosition();
    		}
    	//	public void keyReleased(KeyEvent k2)
    	//	{}
    		public void keyTyped(KeyEvent k3)
    		{
        		if(k3.getSource()== ta)
        		{
        			flag = 1;   //      Values are in TextArea or not keyTyped()          
            		if(ta.getText().equals(""))
  	        		flag=0;
         		}
     		} 
    	});
	}
    ////////////////////////////////Key listener /////////////////
    
    ////////////////////////////// text values/////////////////////////
    public void textValueChanged(TextEvent te)
    {
    	
         
        }
  ///////////////////////////////////Event Listner////////////////////      
   public void actionPerformed(ActionEvent ap)
   {
   		if(ap.getSource()==b6)   // frame f2 is close button work
        {
            f2.setVisible(false);
            f2.dispose();
        }
        if(ap.getSource()==b4) // frame f1 is close frame button is working
        {
            f1.setVisible(false);
            f1.dispose();
        }
        if(ap.getSource()==b9) // frame f3 window working
        {
            f3.setVisible(false);
            f3.dispose();
        }
        if(ap.getSource()==b8) // frame f3 working dont save is working
        {
            f3.setVisible(false);
            f3.dispose();
        }
        if(ap.getSource()==b10) // frame f3 working dont save is working
        {
            f3.setVisible(false);
            f3.dispose();
            f.setVisible(false);
            f.dispose();
        }
        if(ap.getSource()==b11) // frame f5 closing can not found
        {
            f5.setVisible(false);
            f5.dispose();
        }
/////////////////////////////////////////////Dont save operation///////////////////////////////////
        if(ap.getSource()==b8)
        {
	        f.setTitle("Untitled-Notepad");
            ta.setText("");
        }
     ///////////////////////////// New /////////////////////////////////

    	if(ap.getSource()==ne)
    	{
            if(flag==0)
            {
            	f.setTitle("Untitled-Notepad");
            	ta.setText(" ");
            }
            else
            {
            	f3=new JFrame();
           	    f3.addWindowListener(this);
                f3.setBackground(Color.red);
                f3.setSize(300,170);
       	        f3.setLayout(null);
                l4 = new JLabel("Do you want to save this file ");
                l4.setFont(new Font("Serif",Font.PLAIN,20));
                l4.setLocation(30,50);
                l4.setSize(240,40);
                b7 = new JButton("save");
                b7.addActionListener(this);
             	b7.setLocation(50,100);
                b7.setSize(60,30);
                b8 = new JButton("Don'tSave");
                b8.addActionListener(this);
                b8.setLocation(120,100);
                b8.setSize(70,30);
   	            b9 = new JButton("Cancle");
                b9.addActionListener(this);
                b9.setLocation(200,100);
                b9.setSize(60,30);
                f3.add(l4);f3.add(b7);f3.add(b8);f3.add(b9);
                f3.setVisible(true);
            }
            System.out.print("new"+flag);
         }
/////////////////////////// Open ///////////////////////////////////////    
         if(ap.getSource()==op)
		 {
         	if(flag == 0)
         	{
         		try
         		{
         			fd=new FileDialog(f,"select",FileDialog.LOAD);
         			fd.setVisible(true);
             		String   path=fd.getDirectory();
            		String  name=fd.getFile();
            		String str=ta.getText();
            		Scanner sc = new Scanner(new File(path+"/"+name));
            		ta.setText(" ");
            		f.setTitle(name);
            		while (sc.hasNextLine()) 
                	{
                    	if(sc == null)
                        	break;
                     	ta.setText(ta.getText()+sc.nextLine()); 
                	}
            	}
            	catch(Exception e1)
            	{
                	e1.getMessage();
            	}
            }
           	else
           	{ 
            	f3=new JFrame();
            	f3.addWindowListener(this);
            	f3.setBackground(Color.black);
   	        	f3.setSize(300,170);
            	f3.setLayout(null);
            	l4 = new JLabel("Do you want to save this file ");
            	l4.setFont(new Font("Serif",Font.PLAIN,20));
            	l4.setLocation(30,50);
            	l4.setSize(240,40);
            	b7 = new JButton("save");
            	b7.addActionListener(this);
            	b7.setLocation(50,100);
            	b7.setSize(60,30);
            	b8 = new JButton("Don'tSave");
            	b8.addActionListener(this);
            	b8.setLocation(120,100);
            	b8.setSize(70,30);
            	b9 = new JButton("Cancle");
            	b9.addActionListener(this);
                b9.setLocation(200,100);
                b9.setSize(60,30);
              	f3.add(l4);f3.add(b7);f3.add(b8);f3.add(b9);
                f3.setVisible(true);
           	}
           	System.out.println("open"+flag);
		 }
 /////////////////////////////////////////////////  save //////////////////        
         if(ap.getSource()==sa|ap.getSource()==b7)
         { 
         	try
         	{
            	if(f.getTitle().equals("Untitled-Notepad"))
            	{
                	fd=new FileDialog(f,"select",FileDialog.SAVE);
                	fd.setVisible(true);
                	String path=fd.getDirectory();
                	String name=fd.getFile();
                	if(path.equals(""))
                	{
                		flag=1;
                	}
                	else
                    {
                        flag = 0;
                    }
                    if(flag == 0)
                    {
             	       String str=ta.getText();
                       File fi=new File(path+"/"+name);
                       BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(fi));
                       bos.write(str.getBytes());
                       bos.flush();
                       flag=0;
                       f.setTitle(fi.getName());
                       bos.close();
                    }
            	}
                else
                {
        		    String path = null,name = null;
                    if(path.equals(""))
                    {
 	      	        	flag=1;
                    }
                    else
                    {
            		    flag=0;
                    }
                    String str=ta.getText();
                    File fi=new File(path+"/"+name);
                    BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(fi));
                    bos.write(str.getBytes());
                    bos.flush();
               	    f.setTitle(fi.getName());
                    bos.close();
                   	flag=0;
               	}
         	}
            catch(Exception e1)
            {
        		e1.getMessage();
            }
            System.out.println("save"+flag);
         }
  ///////////////////////////////////////// save as /////////////////////////       
         if(ap.getSource()==saa)
    	 {
  	     	try
         	{
        		FileDialog fd=new FileDialog(f,"select",FileDialog.SAVE);
            	fd.setVisible(true);
            	String name,path;
            	path=fd.getDirectory();
            	name=fd.getFile();
            	String str=ta.getText();
            	File fi=new File(path+"/"+name);
            	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(fi));
            	for(int i=0;i < str.length() ;i++)
              	{
               		bos.write((char)str.charAt(i));
              	}
               	bos.flush();
               	f.setTitle(fi.getName());
              	bos.close();
            }
            catch(Exception e1)
            {
                e1.getMessage();
            }
        }
  ///////////////////////////////////////// exit /////////////////////////////////////////       
         if(ap.getSource()==ex)
         {
            System.exit(0);
         }
//////////////////////////////////////////  Find-/////////////////////////////////--------------------------------
       if(ap.getSource()==fi)
       {
       		f2=new JFrame();
           	f2.addWindowListener(this);
          	f2.setBackground(Color.red);
          	f2.setSize(300,250);
          	f2.setLayout(null);
          	l3 = new JLabel("Find");
          	l3.setLocation(50,50);
          	l3.setSize(40,40);
          	t3 = new JTextField(20);
          	t3.setLocation(100,55); // x 100 y55
          	t3.setSize(150,24);
          	b5 = new JButton("FindNext");
          	b5.addActionListener(this);
          	b5.setLocation(70,170);
          	b5.setSize(60,30);
         	b6 = new JButton("Close");
          	b6.addActionListener(this);
          	b6.setLocation(170,170);
          	b6.setSize(60,30);
          	f2.add(t3);f2.add(l3);f2.add(b5);f2.add(b6);
          	f2.setVisible(true);
       }
///////////////////////////////// find operation////////////////////////////////////
       if(ap.getSource()==b5) 
       {                    
       		Pattern p=Pattern.compile("\r");
            Matcher m=p.matcher(ta.getText());
            String Stemp=m.replaceAll(" ");
            int index1=(Stemp.indexOf(t3.getText(),n1));
            int index2=((t3.getText()).length()+index1);
            if(index1 == -1)
            {
            	f5=new JFrame();
                f5.addWindowListener(this);
                f5.setVisible(true);
                f5.setBackground(Color.yellow);
                f5.setSize(300,150);
                f5.setLayout(null);
                l5 = new JLabel("Can not find "+"\""+t3.getText()+"\"");
                l5.setFont(new Font("Serif",Font.PLAIN,22));
                l5.setLocation(50,50);
                l5.setSize(230,20);
                b11= new JButton("Ok");
                b11.addActionListener(this);
                b11.setLocation(150,95);
                b11.setSize(25,25);
                f5.add(l5);f5.add(b11);
            }
            else
            {
            	n1=index2;
                ta.select(index1,index2);
                ta.requestFocus();// 
            }           
       }                      
////////////////////////////////////find and replace ////////////////////////////////////
       if(ap.getSource()==fir)
       {
    		f1=new JFrame();
           	f1.addWindowListener(this);
          	f1.setBackground(Color.green);
          	f1.setSize(350,300);
          	f1.setLayout(null);
          	l1= new JLabel("Find");
          	l1.setLocation(50,40);
          	l1.setSize(40,50);
          	t1 =new JTextField(20);
          	t1.setLocation(100,55);
          	t1.setSize(100,25);
          	l2 = new JLabel ("With");
          	l2.setLocation(50,90);
          	l2.setSize(40,40);
         	t2 = new JTextField(20);
          	t2.setLocation(100,95);
          	t2.setSize(100,25);
          	b1 = new JButton("Find Next");
          	b1.addActionListener(this);
          	b1.setLocation(30,250);
          	b1.setSize(60,30);
          	b2 = new JButton("Replace");
          	b2.addActionListener(this);
          	b2.setLocation(100,250);
          	b2.setSize(55,30);
          	b3 = new JButton("Replace All");
          	b3.addActionListener(this);
          	b3.setLocation(165,250);
          	b3.setSize(70,30);
          	b4 = new JButton("Cancle");
          	b4.addActionListener(this);
          	b4.setLocation(245,250);
          	b4.setSize(50,30);
          	f1.setVisible(true);
          	f1.add(l1);f1.add(t1); f1.add(l2); f1.add(t2);
          	f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);
       }
/////////////////////////////////    find and replace operation working //////////////////
       if(ap.getSource()==b1)   // find
       {                    
       		Pattern p=Pattern.compile("\r");
            Matcher m=p.matcher(ta.getText());
            String Stemp=m.replaceAll(" ");
            int index1=(Stemp.indexOf(t1.getText(),n1));
            int index2=((t1.getText()).length()+index1);
            if(index1 == -1)
            {
            	f5=new JFrame();
                f5.addWindowListener(this);
                f5.setVisible(true);
                f5.setBackground(Color.pink);
                f5.setSize(300,150);
                f5.setLayout(null);
              	l5 = new JLabel("Can not find "+"\""+t1.getText()+"\"");
                l5.setFont(new Font("Serif",Font.PLAIN,22));
                l5.setLocation(50,50);
                l5.setSize(230,20);
          	    b11= new JButton("Ok");
                b11.addActionListener(this);
               	b11.setLocation(150,95);
               	b11.setSize(25,25);
                f5.add(l5); f5.add(b11);
            }
           	else
            {
            	n1=index2;
                ta.select(index1,index2);
                ta.requestFocus();// 
            }           
       }
       ///////////////// replace ////////////////////////
       if(ap.getSource()==b2) // replace button b2
       {
       		Pattern p=Pattern.compile("\r");
           	Matcher m=p.matcher(ta.getText());
           	String Stemp=m.replaceAll("");
            int index1=(Stemp.indexOf(t1.getText(),n2));
            int index2=((t1.getText()).length()+index1);
            if(index1 == -1)
            {
            	f5=new JFrame();
                f5.addWindowListener(this);
              	f5.setVisible(true);
              	f5.setBackground(Color.blue);
                f5.setSize(300,150);
                f5.setLayout(null);
                l5 = new JLabel("Can not find "+"\""+t1.getText()+"\"");
                l5.setFont(new Font("Serif",Font.PLAIN,22));
                l5.setLocation(50,50);
                l5.setSize(230,20);
                b11= new JButton("Ok");
                b11.addActionListener(this);
                b11.setLocation(150,95);
                b11.setSize(25,25);
                f5.add(l5);f5.add(b11);
            }
            else
            {
            	n=((t2.getText()).length()+index1);
//            	ta.replaceText(t2.getText(),index1,index2);
            }
       }
  /////////////////////////////  replace all ////////////////////////////////////////
       if(ap.getSource()==b3) // b3 is button replace all
       {
       		Pattern p=Pattern.compile("\r");
            Matcher m=p.matcher(ta.getText());
            String Stemp=m.replaceAll("");
            int index1=(Stemp.indexOf(t1.getText(),n2));
            int index2=((t1.getText()).length()+index1);
            if(index1 == -1)
            {
            	f5=new JFrame();
                f5.addWindowListener(this);
                f5.setVisible(true);
                f5.setBackground(Color.orange);
              	f5.setSize(300,150);
               	f5.setLayout(null);
                l5 = new JLabel("Can not find "+"\""+t1.getText()+"\"");
                l5.setFont(new Font("Serif",Font.PLAIN,22));
                l5.setLocation(50,50);
                l5.setSize(230,20);
                b11= new JButton("Ok");
                b11.addActionListener(this);
                b11.setLocation(150,95);
                b11.setSize(25,25);
                f5.add(l5);  f5.add(b11);
            }
            else
            {
            	Pattern pa=Pattern.compile(t1.getText());
                Matcher ma=pa.matcher(ta.getText());
               	ta.setText(ma.replaceAll(t2.getText()));
            }
       }
   }
/////////////////////////////////////// window frame cross"X" button workinggggggg ///////////     
   public void windowClosing(WindowEvent e)
   {
   		if(flag==0)
        {
        	if(e.getSource()==f)
            {
            	Window w=e.getWindow();
                w.setVisible(false);
                w.dispose();
                System.exit(1);
            }
        }
        if(flag==1)  // else  // flag==0  else case work  
        {
        	f3=new JFrame();
            f3.addWindowListener(this);
            f3.setBackground(Color.cyan);
           	f3.setSize(300,170);
            f3.setLayout(null);
           	l4 = new JLabel("Do you want to save this file ");
            l4.setFont(new Font("Serif",Font.PLAIN,20));
            l4.setLocation(30,50);
            l4.setSize(240,40);
            b7 = new JButton("save");
            b7.addActionListener(this);
            b7.setLocation(50,100);
            b7.setSize(60,30);
            b10 = new JButton("Don'tSave");
          	b10.addActionListener(this);
         	b10.setLocation(120,100);
            b10.setSize(70,30);
           	b9 = new JButton("Cancle");
           	b9.addActionListener(this);
            b9.setLocation(200,100);
            b9.setSize(60,30);
         	f3.add(l4);f3.add(b7);f3.add(b10);f3.add(b9);
            f3.setVisible(true);
        }
        if(e.getSource()==f1)  // find window closeing
        {
        	f1.setVisible(false);
       	    f1.dispose();
        }
        if(e.getSource()==f2)  // findreplace window closeing
        {
	        f2.setVisible(false);
            f2.dispose();
        }
        if(e.getSource()==f3)  // Do u want save window closeing
        {
     	   f3.setVisible(false);
           f3.dispose();
        }
        if(e.getSource()==f5)  // can not found window close
        {
	        f5.setVisible(false);
            f5.dispose();
        }
       	if(e.getSource()==b10)
        {
        	f5.setVisible(false);
            f5.dispose();
        }
   }
   public static void main(String args[])
   {
  		Notepad nt= new Notepad();
   }
}