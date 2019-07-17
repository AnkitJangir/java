import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class A extends JFrame implements ActionListener
{
	JFrame f,f1;
	JPanel p;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41,t42,t43,t44,t45,t46,t47,t48,t49,t50,t51,t52,t53,t54,t55,t56,t57,t58,t59,t60,t61,t62,t63,t64,t65,t66,t67,t68,t69,t70,t71,t72,t73,t74,t75,t76,t77,t78,t79,t80;
	A(String a)
	{
		super(a);
		f1=new JFrame();
		p=new JPanel();
		b1=new JButton("Jan");
		b2=new JButton("Feb");
		b3=new JButton("Mar");
		b4=new JButton("April");
		b5=new JButton("May");
		b6=new JButton("June");
		b7=new JButton("July");
		b8=new JButton("Agu.");
		b9=new JButton("Sept");
		b10=new JButton("Oct");
		b11=new JButton("Nov");
		b12=new JButton("Dec");
		
		b1.setBounds(40,240,50,40);
	 	b2.setBounds(110,240,50,40);
		b3.setBounds(180,240,50,40);
		b4.setBounds(40,170,50,40); 
		b5.setBounds(110,170,50,40);
		b6.setBounds(180,170,50,40);
		b7.setBounds(40,100,50,40);
		b8.setBounds(110,100,50,40);
		b9.setBounds(180,100,50,40);
		b10.setBounds(300,400,50,30);
		b11.setBounds(150,50,30,50);
		b12.setBounds(400,50,30,60);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		f1.add(p);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.setSize(100,300);
		p.setBackground(Color.red);
		f1.setSize(500,400);
		GridLayout gl=new GridLayout(4,3);
		p.setLayout(gl);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			f=new JFrame("a");
			setBackground(Color.cyan);
			setVisible(true);
			setSize(600,600);
			
			//setLayout(new FlowLayout());
			l1=new JLabel("::: Milk Details Of A Month:::");
			l2=new JLabel("DAY");
			l3=new JLabel("KG");
			l4=new JLabel("RS");
			l5=new JLabel("TOTAL");
			l6=new JLabel("DAY");
			l7=new JLabel("KG");
			l8=new JLabel("RS");
			l9=new JLabel("TOTAL");
			l10=new JLabel("DAY");
			l11=new JLabel("RS");
			l12=new JLabel("TOTAL");
			l13=new JLabel("DAY 1");
			l14=new JLabel("DAY 2");
			l15=new JLabel("DAY 3");
			l16=new JLabel("DAY 4");
			l17=new JLabel("DAY 5");
			l18=new JLabel("DAY 6");
			l19=new JLabel("DAY 7");
			l20=new JLabel("DAY 8");
			l21=new JLabel("DAY 9");
			l22=new JLabel("DAY 10");
			l23=new JLabel("DAY 11");
			l24=new JLabel("DAY 12");
			l25=new JLabel("DAY 13");
			l26=new JLabel("DAY 14");
			l27=new JLabel("DAY 15");
			l28=new JLabel("DAY 16");
			l29=new JLabel("DAY 17");
			l30=new JLabel("DAY 18");
			l31=new JLabel("DAY 19");
			l32=new JLabel("DAY 20");
			l33=new JLabel("DAY 21");
			l34=new JLabel("DAY 22");
			l35=new JLabel("DAY 23");
			l36=new JLabel("DAY 24");
			l37=new JLabel("DAY 25");
			l38=new JLabel("DAY 26");
			l39=new JLabel("DAY 27");
			l40=new JLabel("DAY 28");
			l41=new JLabel("DAY 29");
			l41=new JLabel("DAY 30");
			l42=new JLabel("DAY 31");
						
			t1=new JTextField();
			t2=new JTextField();
			t3=new JTextField();
			
			
			l1.setBounds(150,10,300,40);
			l2.setBounds(5,50,30,10);
			l3.setBounds(40,50,30,10);
			l4.setBounds(60,50,30,10);
			l5.setBounds(80,50,50,10);
			l6.setBounds(130,50,50,10);
			l7.setBounds(160,50,50,10);
			l8.setBounds(180,50,30,10);
			l9.setBounds(200,50,50,10);
			l10.setBounds(250,50,30,10);
			l11.setBounds(280,50,30,10);
			l12.setBounds(300,50,50,10);
			l13.setBounds(2,70,50,20);			
			l14.setBounds(2,90,50,20);		
			l15.setBounds(2,110,50,20);
			l16.setBounds(2,130,50,20);
			l17.setBounds(2,150,50,20);
			l18.setBounds(2,170,50,20);
			l19.setBounds(2,190,50,20);
			l20.setBounds(2,210,50,20);
			l21.setBounds(2,230,50,20);
			l22.setBounds(2,250,50,20);
			l23.setBounds(2,270,50,20);
			l24.setBounds(2,290,50,20);
			l25.setBounds(2,310,50,20);
			l26.setBounds(2,330,50,20);
			l27.setBounds(2,350,50,20);
			
			l28.setBounds(120,90,50,10);
			l29.setBounds(2,390,50,20);
			l30.setBounds(2,410,50,20);
			l31.setBounds(2,430,50,20);
			l32.setBounds(2,600,50,20);
			//l33.setBounds()
			
			t1.setBounds(40,60,30,10);
			add(t1);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			add(l1);
			add(l2);
			add(l3);
			add(l4);
			add(l5);
			add(l6);
			add(l7);
			add(l8);
			add(l9);
			add(l10);
			add(l11);
			add(l12);
			add(l13);
			t1.setBounds(40,60,30,10);
			add(t1);
			add(l14);
			add(l15);
			add(l16);
			add(l17);
			add(l18);
			add(l19);
			add(l20);
			add(l21);
			add(l22);
			add(l23);
			add(l24);
			add(l25);
			add(l26);
			add(l27);
			add(l28);
			add(l29);
			add(l30);
			add(l31);
			add(l32);
			
			/*
			
			t2.setBounds(40,60,30,10);
			add(t2);
			t3.setBounds(60,60,30,10);
			add(t3);
			*/
		}
	}
	public static void main(String[] args) 
	{
		new A("Ankit");
    }
}
