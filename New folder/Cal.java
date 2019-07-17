import java.awt.*;
import java.awt.event.*;
class cal implements ActionListener
{
	Frame f;
    Panel p;
    GridLayout c;
    TextField t;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    BorderLayout bb;
    Font fb;
    double a=0,b=0,result=0;
    int operator=0;
     public cal()
	{
	   f=new Frame();f.setBackground(Color.black); fb= new Font("Airal",Font.BOLD,30);
	   p = new Panel(new GridLayout(4,4,4,4)); bb= new BorderLayout();f.setVisible(true);
       c = new GridLayout(0,1);t =new TextField();  f.setSize(400,300);
       f.setLayout(bb);
	    b1=new Button("7");     b1.addActionListener(this); 
        b2=new Button("8");     b2.addActionListener(this);
        b3=new Button("9");     b3.addActionListener(this);
        b4=new Button("*");     b4.addActionListener(this);
        b5=new Button("4");     b5.addActionListener(this);
        b6=new Button("5");     b6.addActionListener(this);
        b7=new Button("6");     b7.addActionListener(this);
        b8=new Button("-");     b8.addActionListener(this);
        b9=new Button("1");     b9.addActionListener(this);
        b10=new Button("2");    b10.addActionListener(this);
        b11=new Button("3");    b11.addActionListener(this);
        b12=new Button("+");    b12.addActionListener(this);
        b13=new Button("c");    b13.addActionListener(this);
        b14=new Button("0");    b14.addActionListener(this);
        b15=new Button("/");    b15.addActionListener(this);
        b16=new Button("=");    b16.addActionListener(this);
        
        
        b1.setFont(fb);b2.setFont(fb);b3.setFont(fb);b4.setFont(fb);b5.setFont(fb);b6.setFont(fb);
        b7.setFont(fb);b8.setFont(fb);b9.setFont(fb);b10.setFont(fb);b11.setFont(fb);b12.setFont(fb);
        b13.setFont(fb);b14.setFont(fb);b15.setFont(fb);b16.setFont(fb);
        //b1.setBackground(Color.cyan);

         
    p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);  
    p.add(b6);p.add(b7);p.add(b8);p.add(b9);p.add(b10);
    p.add(b11);p.add(b12);p.add(b13);
    p.add(b14);p.add(b15);p.add(b16);
     f.add(t,BorderLayout.NORTH);
    f.add(p);//(add(p),BorderLayout.CENTER);    
    }

//-----------------------------------------------------------
      public void actionPerformed(ActionEvent e)
   {
        if(e.getSource()==b1)
            t.setText(t.getText().concat("7"));
        if(e.getSource()==b2)
            t.setText(t.getText().concat("8"));
        if(e.getSource()==b3)
            t.setText(t.getText().concat("9"));
        if(e.getSource()==b5)
            t.setText(t.getText().concat("4"));
        if(e.getSource()==b6)
            t.setText(t.getText().concat("5"));
        if(e.getSource()==b7)
            t.setText(t.getText().concat("6"));
        if(e.getSource()==b9)
            t.setText(t.getText().concat("1"));
        if(e.getSource()==b10)
            t.setText(t.getText().concat("2"));
        if(e.getSource()==b11)
            t.setText(t.getText().concat("3"));
        if(e.getSource()==b14)
            t.setText(t.getText().concat("0"));
        
        if(e.getSource()==b12)
        {
            a=Double.parseDouble(t.getText());
            operator=1;t.setText("");
        } 
        if(e.getSource()==b8)
        {
            a=Double.parseDouble(t.getText());
            operator=2;t.setText("");
        }
        if(e.getSource()==b4)
        {
            a=Double.parseDouble(t.getText());
            operator=3;t.setText("");
        }
        if(e.getSource()==b15)
        {
            a=Double.parseDouble(t.getText());
            operator=4;t.setText("");
        }
        if(e.getSource()==b16)
        {
         b=Double.parseDouble(t.getText());
            switch(operator)
            {
                case 1: result=a+b;
                    break;
                 case 2: result=a-b;
                    break;
                case 3: result=a*b;
                    break;
                case 4: result=a/b;
                    break;
                default: result=0;
            }
             t.setText(""+result);
        }
        if(e.getSource()==b13)
           t.setText("");
    }
     public static void main(String args[])
        {
            cal c=new cal();
        }
}