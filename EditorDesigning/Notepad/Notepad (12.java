import java.io.*;
import java.awt.*;
import java.awt.event.*;
class Notepad extends WindowAdapter implements ActionListener,TextListener
{
	Frame f,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10; // f1 find replace
	MenuBar mb;
	Menu m1,m2,m3;
	MenuItem ne,op,sa,saa,ex,fi,fir;
    Panel p;
    TextArea ta,ta1;
    TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    Label l1,l2,l3,l4,l5,l6;
    int flag=0,flag1=0,flag2=0,flag3=0,flag4=0,flag5=0;
	public Notepad()
	{
	//	f=new Frame();
        f=new Frame("Untitled-Notepad");
        f.setSize(600,600);
      
		//f.setLayout(new GridLayout(1,1));
	    ta = new TextArea();
        f.add(ta);
        //ta.setText(" ");
		//ta = new TextField(44);
		mb = new MenuBar();
		m1 = new Menu("File");
		     ne = new MenuItem("New");
             op = new MenuItem("Open");
             sa = new MenuItem("Save");
             saa= new MenuItem("Save As");
             ex = new MenuItem("Exit");
		m2 = new Menu("Find");
		      fi = new MenuItem("Find");
		      fir = new MenuItem("Find & Replace");
          
		
		//f.add(p);
		m1.add(ne);m1.add(op);m1.add(sa);m1.add(saa);m1.addSeparator();m1.add(ex);
        mb.add(m1);
        m2.add(fi);m2.add(fir);
         mb.add(m2);
       f.setMenuBar(mb);
       f.setVisible(true);
       ne.addActionListener(this);
       op.addActionListener(this);
       ex.addActionListener(this);
       sa.addActionListener(this);
       saa.addActionListener(this);
       fi.addActionListener(this);
       
       fir.addActionListener(this);
       f.addWindowListener(this);
    }

    ////////////////////////////// text values/////////////////////////
    public void textValueChanged(TextEvent te)
        {
        /*if(te.getSource()== ta)
         {
         if(txt1.getText().equals(""))
         fndnxt1.setEnabled(false);
         else
         fndnxt1.setEnabled(true);
         }
        //--------------------------------------
       /*  if(te.getSource()== txt2)
         {
           flag5=0;
           flag=0;
             if(txt2.getText().equals(""))
                {
                    fndnxt2.setEnabled(false);
                //    replc.setEnabled(false);
                  //  replcall.setEnabled(false);
                 }
             else
                  {         
                    fndnxt2.setEnabled(true);
                    //replc.setEnabled(true);
                    //replcall.setEnabled(true);
         }          }*/
         
        }
   public void actionPerformed(ActionEvent ap)
    {
        if(ap.getSource()==b6)   // fram f2 is close button work
        {
            f2.setVisible(false);
                f2.dispose();
        }
        if(ap.getSource()==b4) // fram f1 is close frame button is working
        {
            f1.setVisible(false);
                f1.dispose();
        }
     
     ///////////////////////////// New /////////////////////////////////

    	if(ap.getSource()==ne)
    	{
            
            if(flag == 0)
                        {
                           f.setTitle("Untitled-Notepad");
                           ta.setText(" ");
                        }
                    else
                         {
                                System.out.print("hello Notepad");
                         }
         }
         if(ap.getSource()==op)
    	{
    	  
         }
         if(ap.getSource()==sa)
    	{
    	  ta.setText("java save");
         }
         if(ap.getSource()==saa)
    	{
    	  ta.setText("java saveas");
         }
         if(ap.getSource()==ex)
         {
            System.exit(0);
         }

//-----------------Find---------------------------------
       if(ap.getSource()==fi)
    	{
    	  f2=new Frame();
           f2.addWindowListener(this);
          f2.setBackground(Color.red);
          f2.setSize(300,250);
          f2.setLayout(null);
          l3 = new Label("Find");
          l3.setLocation(50,50);
          l3.setSize(40,40);
          t3 = new TextField(20);
          t3.setLocation(100,55); // x 100 y55
          t3.setSize(150,24);
          b5 = new Button("FindNext");
          b5.setLocation(70,170);
          b5.setSize(60,30);
          b6 = new Button("Close");
          b6.addActionListener(this);
          b6.setLocation(170,170);
          b6.setSize(60,30);
          f2.add(t3);f2.add(l3);f2.add(b5);f2.add(b6);
          f2.setVisible(true);
             

         }
//----------- find and replace------------------
         if(ap.getSource()==fir)
    	{
    	  f1=new Frame();
           f1.addWindowListener(this);
          f1.setBackground(Color.red);
          f1.setSize(350,300);
          f1.setLayout(null);
          l1= new Label("Find");
          l1.setLocation(50,40);
          l1.setSize(40,50);
          t1 =new TextField(20);
          t1.setLocation(100,55);
          t1.setSize(100,25);
          l2 = new Label ("With");
          l2.setLocation(50,90);
          l2.setSize(40,40);
          t2 = new TextField(20);
          t2.setLocation(100,95);
          t2.setSize(100,25);
          b1 = new Button("Find Next");
          b1.setLocation(30,250);
          b1.setSize(60,30);
          b2 = new Button("Replace");
          b2.setLocation(100,250);
          b2.setSize(55,30);
          b3 = new Button("Replace All");
          b3.setLocation(165,250);
          b3.setSize(70,30);
          b4 = new Button("Cancle");
          b4.addActionListener(this);
          b4.setLocation(245,250);
          b4.setSize(50,30);
          f1.setVisible(true);
          f1.add(l1);f1.add(t1); f1.add(l2); f1.add(t2);
          f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);


         }
     }
          public void windowClosing(WindowEvent e)
        {
            if(e.getSource()==f)
            {
            Window w=e.getWindow();
            w.setVisible(false);
            w.dispose();
            System.exit(1);
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


        }
    
	public static void main(String args[])
	{
	 Notepad nt= new Notepad();
	}
}