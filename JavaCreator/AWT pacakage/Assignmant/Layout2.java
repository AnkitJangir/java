import java.awt.*;
class Layout2
{
	public static void main(String args[])
	{
	   Frame f=new Frame();
	   GridLayout gl = new GridLayout(2,2);
	    f.setSize(400,300);
	    f.setLayout(gl);
	    f.setVisible(true);
      
      Panel p1 = new Panel(new GridLayout(0,1));
      Panel p2 = new Panel(new GridLayout(0,3));
      Panel p3 = new Panel(new GridLayout(0,1));
      Panel p4 = new Panel(new GridLayout(0,1)); 
      Panel p5 = new Panel(new GridLayout(1,0));
      Panel p6 = new Panel(new GridLayout(1,0));
      Panel p7 = new Panel(new GridLayout(1,0));
      Panel p8 = new Panel(new GridLayout(0,1));
      Button b1=new Button("1");  
        Button b2=new Button("2");  
        Button b3=new Button("3");  
        Button b4=new Button("4");  
        Button b5=new Button("5");  
        Button b6=new Button("6");  
        Button b7=new Button("7");  
        Button b8=new Button("8");  
        Button b9=new Button("9");  
        Button b10=new Button("10");
        Button b11=new Button("11");
        Button b12=new Button("12");
        Button b13=new Button("13");
        Button b14=new Button("14");
        Button b15=new Button("15");
        
        p1.add(b1); p1.add(b2);
        p2.add(b3);p2.add(b4);p2.add(b5);
         p3.add(b6);p3.add(b7);
         p4.add(b8);p4.add(b9);p4.add(b10);
        p5.add(b11);p5.add(b12);
        p6.add(b13);p6.add(b14);p6.add(b15);
          
          p7.add(p3);
          p7.add(p4);

          p8.add(p5);
          p8.add(p6);

          f.add(p1);
          f.add(p2);
          f.add(p7);
          f.add(p8);
      }
      
    }  