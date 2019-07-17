import java.awt.*;
import java.awt.event.*;
class GridBag2 implements ActionListener
{
       CardLayout cl; 
      //BorderLayout c1;  
       Panel p1,p2,p3,p4,p5,p6;
       Button b1,b2;
       Frame f;
       TextField t1;
       int a=1;
        GridBag2()
    	  {

        cl = new CardLayout();
	     f = new Frame();
        f.setLayout( new CardLayout());
	     p1 = new Panel(new GridBagLayout());  //form
        p2 = new Panel(new GridBagLayout());  // form
        p3 = new Panel(new GridBagLayout());  //form
        p4 = new Panel(new GridBagLayout());   //form
        p5 = new Panel ();

        p6 = new Panel(new BorderLayout());
        b1 = new Button("Back");
        b1.addActionListener(this);
        b2 = new Button("Next");
        b2.addActionListener(this);
	     f.setSize(400,400);
	     f.setVisible(true);
	     
	     
         GridBagConstraints gbc = new GridBagConstraints();
         gbc.gridx=0;            gbc.gridy=0;
         gbc.gridwidth=2;        gbc.gridheight=2;
         gbc.ipadx=6;            gbc.ipady=4;
         Insets i = new Insets(5,5,5,5);
         gbc.insets=i;
         gbc.fill=GridBagConstraints.HORIZONTAL;
         gbc.anchor= GridBagConstraints.NORTH;
         //gbc.weightx=1.0;   gbc.weighty=1.0;
//============================p1p1p1p1p1p1p1p1==============
         Label l1 = new Label("Name");
         p1.add(l1,gbc);
         
         TextField t1 = new TextField();
         gbc.gridx=2;            gbc.gridy=0;
         p1.add(t1,gbc);
         
         Label l2 = new Label("Surname");
         gbc.gridx=0;            gbc.gridy=2;
         p1.add(l2,gbc);
         
         TextField t2 = new TextField();
         gbc.gridx=2;            gbc.gridy=2;
         p1.add(t2,gbc);
         
         Label l3 = new Label("Age");
         gbc.gridx=0;            gbc.gridy=4;
         p1.add(l3,gbc);
         
         TextField t3 = new TextField();
         gbc.gridx=2;            gbc.gridy=4;
         p1.add(t3,gbc);
         

         Label l4 = new Label("Quefiation");
         gbc.gridx=0;            gbc.gridy=6;
         p1.add(l4,gbc);
         
         TextField t4 = new TextField();
         gbc.gridx=2;            gbc.gridy=6;
         p1.add(t4,gbc);
                 
         
	    //==================p2p2p2p2p2p2p2p2p2p============================
         Label l1p2 = new Label("House No.");
         gbc.gridx=0;            gbc.gridy=0;
         p2.add(l1p2,gbc);
         
         TextField t1p2 = new TextField();
         gbc.gridx=2;            gbc.gridy=0;
         p2.add(t1p2,gbc);
         
         Label l2p2 = new Label("Add");
         gbc.gridx=0;            gbc.gridy=2;
         p2.add(l2p2,gbc);
         
         TextField t2p2 = new TextField();
         gbc.gridx=2;            gbc.gridy=2;
         p2.add(t2p2,gbc);
         
         Label l3p2 = new Label("city");
         gbc.gridx=0;            gbc.gridy=4;
         p2.add(l3p2,gbc);
         
         TextField t3p2 = new TextField();
         gbc.gridx=2;            gbc.gridy=4;
         p2.add(t3p2,gbc);
         

         Label l4p2 = new Label("State");
         gbc.gridx=0;            gbc.gridy=6;
         p2.add(l4p2,gbc);
         
         TextField t4p2 = new TextField();
         gbc.gridx=2;            gbc.gridy=6;
         p2.add(t4p2,gbc);
                 
         
    //===================p3p3p3p3p3p3p3======================

         Label l1p3 = new Label("Phone No.");
         gbc.gridx=0;            gbc.gridy=0;
         p3.add(l1p3,gbc);
         
         TextField t1p3 = new TextField();
         gbc.gridx=2;            gbc.gridy=0;
         p3.add(t1p3,gbc);
         
         Label l2p3 = new Label("Mobile");
         gbc.gridx=0;            gbc.gridy=2;
         p3.add(l2p3,gbc);
         
         TextField t2p3 = new TextField();
         gbc.gridx=2;            gbc.gridy=2;
         p3.add(t2p3,gbc);
         
         Label l3p3 = new Label("Email");
         gbc.gridx=0;            gbc.gridy=4;
         p3.add(l3p3,gbc);
         
         TextField t3p3 = new TextField();
         gbc.gridx=2;            gbc.gridy=4;
         p3.add(t3p3,gbc);
         

         Label l4p3 = new Label("Fax");
         gbc.gridx=0;            gbc.gridy=6;
         p3.add(l4p3,gbc);
         
         TextField t4p3 = new TextField();
         gbc.gridx=2;            gbc.gridy=6;
         p3.add(t4p3,gbc);
                 
         
//==============================p4p4p4p4p4p4p=========================
         Label l1p4 = new Label("Salary");
         gbc.gridx=0;            gbc.gridy=0;
         p4.add(l1p4,gbc);
         
         TextField t1p4 = new TextField();
         gbc.gridx=2;            gbc.gridy=0;
         p4.add(t1p4,gbc);
         
         Label l2p4 = new Label("H.R.A");
         gbc.gridx=0;            gbc.gridy=2;
         p4.add(l2p4,gbc);
         
         TextField t2p4 = new TextField();
         gbc.gridx=2;            gbc.gridy=2;
         p4.add(t2p4,gbc);
         
         Label l3p4 = new Label("T.A");
         gbc.gridx=0;            gbc.gridy=4;
         p4.add(l3p4,gbc);
         
         TextField t3p4 = new TextField();
         gbc.gridx=2;            gbc.gridy=4;
         p4.add(t3p4,gbc);
         

         Label l4p4 = new Label("D.A");
         gbc.gridx=0;            gbc.gridy=6;
         p4.add(l4p4,gbc);
         

         TextField t4p4 = new TextField();
         gbc.gridx=2;            gbc.gridy=6;
         p4.add(t4p4,gbc);
                 
    //==============Calling=================================             
          //b1.add(p3);        
         p5.add(b1,"Back1");
         p5.add(b2,"Next1");

         p6.add(p1,"Center");
         p6.add(p5,"South");
         
         f.add(p6);
         
         
        
         
         //cl.previous(p4);
         
        f.add(p2);f.add(p3);f.add(p4);
     }

         public void actionPerformed(ActionEvent e)
         {
           // cl.previous(p5);          
            cl.next(p2);
            p6.add(p2,"Center");
            f.add(p6);
         }
         
         

         public static void main(String args[])
         {
            GridBag2 gb=new GridBag2();
         }
	  
}