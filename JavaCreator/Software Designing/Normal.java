import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class A extends JFrame implements ActionListener
{
	int flag=0;
	static JFrame f,f1;
	static JPanel p;
	static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,l50;
	static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41,t42,t43,t44,t45,t46,t47,t48,t49,t50,t51,t52,t53,t54,t55,t56,t57,t58,t59,t60,t61,t62,t63,t64,t65,t66,t67,t68,t69,t70,t71,t72,t73,t74,t75,t76,t77,t78,t79,t80,t81,t82,t83,t84,t85,t86,t87,t88,t89,t90,t91,t92,t93,t94,t95,t96,t97,t98,t99,t100;
	A(String a)
	{
		super(a);
		f=new JFrame();
		f.setResizable(false);
		p=new JPanel();
		b1=new JButton("January");
		b2=new JButton("Febuary");
		b3=new JButton("March");
		b4=new JButton("April");
		b5=new JButton("May");
		b6=new JButton("June");
		b7=new JButton("July");
		b8=new JButton("Aguest");
		b9=new JButton("September");
		b10=new JButton("Octomber");
		b11=new JButton("November");
		b12=new JButton("December");
		
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
		f.add(p);p.add(b1);p.add(b2);p.add(b3);p.add(b4);
		p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);p.add(b10);p.add(b11);p.add(b12);
		p.setSize(100,300);
		//p.setBackground(Color.red);
		f.setSize(500,400);
		GridLayout gl=new GridLayout(4,3);
		p.setLayout(gl);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			f1=new JFrame("a");
			f1.setResizable(false);
			setVisible(true);
			setSize(600,600);
			l1=new JLabel("::: Milk Details Of A Month:::");l2=new JLabel("DAY");
			l3=new JLabel("KG");l4=new JLabel("RS");
			l5=new JLabel("TOTAL");l6=new JLabel("1 Day");
			l7=new JLabel("2 Day");	l8=new JLabel("3 Day");
			l9=new JLabel("4 Day");l10=new JLabel("5 Day");
			l11=new JLabel("6 Day");l12=new JLabel("7 Day");
			l13=new JLabel("8 Day");l14=new JLabel("9 Day");
			l15=new JLabel("10 Day");l16=new JLabel("11 Day");
			l17=new JLabel("12 Day");l18=new JLabel("13 Day");
			l19=new JLabel("14 Day");l20=new JLabel("15 Day");
			l21=new JLabel("DAY");l22=new JLabel("KG");
			l23=new JLabel("RS");l24=new JLabel("TOTAL");
			l25=new JLabel("l6 Day");l26=new JLabel("l7 Day");
			l27=new JLabel("18 Day");l28=new JLabel("19 Day");
			l29=new JLabel("20 Day");l30=new JLabel("21 Day");
			l31=new JLabel("22 Day");l32=new JLabel("23 Day");
			l33=new JLabel("24 Day");l34=new JLabel("25 Day");
			l35=new JLabel("26 Day");l36=new JLabel("27 Day");
			l37=new JLabel("28 Day");l38=new JLabel("29 Day");
			l39=new JLabel("30 Day");l40=new JLabel("DAY");
			l41=new JLabel("KG");l42=new JLabel("RS");
			l43=new JLabel("TOTAL");l44=new JLabel("31 DAY");
			l45=new JLabel("Same Value All Day KG");l46=new JLabel("KG");
			l47=new JLabel("Same Value All Day RS");l48=new JLabel("RS");
			l50=new JLabel();
			
			t1=new JTextField();
			t2=new JTextField();t3=new JTextField();
			t4=new JTextField();t5=new JTextField();
			t6=new JTextField();t7=new JTextField();
			t8=new JTextField();t9=new JTextField();
			t10=new JTextField();t11=new JTextField();
			t12=new JTextField();t13=new JTextField();
			t14=new JTextField();t15=new JTextField();
			t16=new JTextField();t17=new JTextField();
			t18=new JTextField();t19=new JTextField();
			t20=new JTextField();t21=new JTextField();
			t22=new JTextField();t23=new JTextField();
			t24=new JTextField();t25=new JTextField();
			t26=new JTextField();t27=new JTextField();
			t28=new JTextField();t29=new JTextField();
			t30=new JTextField();t31=new JTextField();
			t32=new JTextField();t33=new JTextField();
			t34=new JTextField();t35=new JTextField();
			t36=new JTextField();t37=new JTextField();
			t38=new JTextField();t39=new JTextField();
			t40=new JTextField();t41=new JTextField();
			t42=new JTextField();t43=new JTextField();
			t44=new JTextField();t45=new JTextField();
			t46=new JTextField();t47=new JTextField();
			t48=new JTextField();t49=new JTextField();
			t50=new JTextField();t51=new JTextField();
			t52=new JTextField();t53=new JTextField();
			t54=new JTextField();t55=new JTextField();
			t56=new JTextField();t57=new JTextField();
			t58=new JTextField();t59=new JTextField();
			t60=new JTextField();t61=new JTextField();
			t62=new JTextField();t63=new JTextField();
			t64=new JTextField();t65=new JTextField();
			t66=new JTextField();t67=new JTextField();t68=new JTextField();
			t69=new JTextField();t70=new JTextField();
			t71=new JTextField();t72=new JTextField();
			t73=new JTextField();t74=new JTextField();
			t75=new JTextField();t76=new JTextField();
			t77=new JTextField();t78=new JTextField();
			t79=new JTextField();t80=new JTextField();
			t81=new JTextField();t82=new JTextField();
			t83=new JTextField();t84=new JTextField();
			t85=new JTextField();t86=new JTextField();
			t87=new JTextField();t88=new JTextField();
			t89=new JTextField();t90=new JTextField();
			t91=new JTextField();t92=new JTextField();
			t93=new JTextField();t94=new JTextField();
			t95=new JTextField();t96=new JTextField();
			t97=new JTextField();t98=new JTextField();
			t99=new JTextField();t100=new JTextField();
			
			b13=new JButton("OK");
			b14=new JButton("OK");
			b15=new JButton("Click Total All Day");
			b16=new JButton("Total Amount Months");
			
			l1.setBounds(150,10,300,40);add(l1);
			
			l2.setBounds(5,50,30,10);add(l2);
			l3.setBounds(50,50,30,10);add(l3);
			l4.setBounds(80,50,30,10);add(l4);
			
			l5.setBounds(110,50,50,10);add(l5);
			
			l6.setBounds(5,70,50,20);add(l6);		//Day 1		
			t1.setBounds(50,70,20,20);add(t1);
			t2.setBounds(80,70,20,20);add(t2);
			t3.setBounds(110,70,30,20);add(t3);
			
			l7.setBounds(5,100,50,20);add(l7);		//Day 2
			t4.setBounds(50,100,20,20);add(t4);
			t5.setBounds(80,100,20,20);add(t5);
			t6.setBounds(110,100,30,20);add(t6);
			
			l8.setBounds(5,130,50,20);add(l8);		//Day 3
			t7.setBounds(50,130,20,20);add(t7);
			t8.setBounds(80,130,20,20);add(t8);
			t9.setBounds(110,130,30,20);add(t9);
			
			l9.setBounds(5,160,50,20);add(l9);		//Day 4
			t10.setBounds(50,160,20,20);add(t10);
			t11.setBounds(80,160,20,20);add(t11);
			t12.setBounds(110,160,30,20);add(t12);
			
			l10.setBounds(5,190,50,20);add(l10);		//Day 5
			t13.setBounds(50,190,20,20);add(t13);
			t14.setBounds(80,190,20,20);add(t14);
			t15.setBounds(110,190,30,20);add(t15);
			
			l11.setBounds(5,220,50,20);add(l11);		//Day 6
			t16.setBounds(50,220,20,20);add(t16);
			t17.setBounds(80,220,20,20);add(t17);
			t18.setBounds(110,220,30,20);add(t18);
			
			l12.setBounds(5,250,50,20);add(l12);		//Day 7
			t19.setBounds(50,250,20,20);add(t19);
			t20.setBounds(80,250,20,20);add(t20);
			t21.setBounds(110,250,30,20);add(t21);
			
			l13.setBounds(5,280,50,20);add(l13);		///Day 8
			t22.setBounds(50,280,20,20);add(t22);
			t23.setBounds(80,280,20,20);add(t23);
			t24.setBounds(110,280,30,20);add(t24);
			
			l14.setBounds(5,310,50,20);add(l14);		//Day 9
			t25.setBounds(50,310,20,20);add(t25);
			t26.setBounds(80,310,20,20);add(t26);
			t27.setBounds(110,310,30,20);add(t27);
			
			l15.setBounds(5,340,50,20);add(l15);		//Day 10
			t28.setBounds(50,340,20,20);add(t28);
			t29.setBounds(80,340,20,20);add(t29);
			t30.setBounds(110,340,30,20);add(t30);
			
			l16.setBounds(5,370,50,20);add(l16);		//Day 11
			t31.setBounds(50,370,20,20);add(t31);
			t32.setBounds(80,370,20,20);add(t32);
			t33.setBounds(110,370,30,20);add(t33);
			
			l17.setBounds(5,400,50,20);add(l17);		//Day12
			t34.setBounds(50,400,20,20);add(t34);
			t35.setBounds(80,400,20,20);add(t35);
			t36.setBounds(110,400,30,20);add(t36);
			
			l18.setBounds(5,430,50,20);add(l18);		//Day 13
			t37.setBounds(50,430,20,20);add(t37);
			t38.setBounds(80,430,20,20);add(t38);
			t39.setBounds(110,430,30,20);add(t39);
			
			l19.setBounds(5,460,50,20);add(l19);		//Day14
			t40.setBounds(50,460,20,20);add(t40);
			t41.setBounds(80,460,20,20);add(t41);
			t42.setBounds(110,460,30,20);add(t42);
			
			l20.setBounds(5,490,50,20);add(l20);		//Day 15
			t43.setBounds(50,490,20,20);add(t43);
			t44.setBounds(80,490,20,20);add(t44);
			t45.setBounds(110,490,30,20);add(t45);
			
			l21.setBounds(165,50,30,10);add(l21);
			l22.setBounds(210,50,30,10);add(l22);
			l23.setBounds(240,50,30,10);add(l23);
			l24.setBounds(270,50,50,10);add(l24);
			
			l25.setBounds(165,70,50,20);add(l25);		//Day 16
			t46.setBounds(210,70,20,20);add(t46);
			t47.setBounds(240,70,20,20);add(t47);
			t48.setBounds(270,70,30,20);add(t48);
			
			l26.setBounds(165,100,50,20);add(l26);		//Day 17
			t49.setBounds(210,100,20,20);add(t49);
			t50.setBounds(240,100,20,20);add(t50);
			t51.setBounds(270,100,30,20);add(t51);
			
			l27.setBounds(165,130,50,20);add(l27);		//Day 18
			t52.setBounds(210,130,20,20);add(t52);
			t53.setBounds(240,130,20,20);add(t53);
			t54.setBounds(270,130,30,20);add(t54);
			
			l28.setBounds(165,160,50,20);add(l28);		//Day 19
			t55.setBounds(210,160,20,20);add(t55);
			t56.setBounds(240,160,20,20);add(t56);
			t57.setBounds(270,160,30,20);add(t57);
			
			l29.setBounds(165,190,50,20);add(l29);		//Day 20
			t58.setBounds(210,190,20,20);add(t58);
			t59.setBounds(240,190,20,20);add(t59);
			t60.setBounds(270,190,30,20);add(t60);
			
			l30.setBounds(165,220,50,20);add(l30);		//Day 21
			t61.setBounds(210,220,20,20);add(t61);
			t62.setBounds(240,220,20,20);add(t62);
			t63.setBounds(270,220,30,20);add(t63);
			
			l31.setBounds(165,250,50,20);add(l31);		//Day 22
			t64.setBounds(210,250,20,20);add(t64);
			t65.setBounds(240,250,20,20);add(t65);
			t66.setBounds(270,250,30,20);add(t66);
			
			l32.setBounds(165,280,50,20);add(l32);		///Day 23
			t67.setBounds(210,280,20,20);add(t67);
			t68.setBounds(240,280,20,20);add(t68);
			t69.setBounds(270,280,30,20);add(t69);
			
			l33.setBounds(165,310,50,20);add(l33);		//Day 24
			t70.setBounds(210,310,20,20);add(t70);
			t71.setBounds(240,310,20,20);add(t71);
			t72.setBounds(270,310,30,20);add(t72);
			
			l34.setBounds(165,340,50,20);add(l34);		//Day 25
			t73.setBounds(210,340,20,20);add(t73);
			t74.setBounds(240,340,20,20);add(t74);
			t75.setBounds(270,340,30,20);add(t75);
			
			l35.setBounds(165,370,50,20);add(l35);		///Day 26
			t76.setBounds(210,370,20,20);add(t76);
			t77.setBounds(240,370,20,20);add(t77);
			t78.setBounds(270,370,30,20);add(t78);
			
			l36.setBounds(165,400,50,20);add(l36);		//Day 27
			t79.setBounds(210,400,20,20);add(t79);
			t80.setBounds(240,400,20,20);add(t80);
			t81.setBounds(270,400,30,20);add(t81);
			
			l37.setBounds(165,430,50,20);add(l37);		//Day 28
			t82.setBounds(210,430,20,20);add(t82);
			t83.setBounds(240,430,20,20);add(t83);
			t84.setBounds(270,430,30,20);add(t84);
			
			l38.setBounds(165,460,50,20);add(l38);		//Day 29
			t85.setBounds(210,460,20,20);add(t85);
			t86.setBounds(240,460,20,20);add(t86);
			t87.setBounds(270,460,30,20);add(t87);
			
			l39.setBounds(165,490,50,20);add(l39);		//Day 30
			t88.setBounds(210,490,20,20);add(t88);
			t89.setBounds(240,490,20,20);add(t89);
			t90.setBounds(270,490,30,20);add(t90);
			
			l40.setBounds(320,50,50,10);add(l40);		
			l41.setBounds(365,50,30,10);add(l41);
			l42.setBounds(395,50,30,10);add(l42);
			l43.setBounds(425,50,50,10);add(l43);
			
			l44.setBounds(320,70,50,20);add(l44);		//Day 31
			t91.setBounds(365,70,20,20);add(t91);
			t92.setBounds(395,70,20,20);add(t92);
			t93.setBounds(425,70,30,20);add(t93);
			
			l45.setBounds(320,95,150,30);add(l45);		//Default KG
			l46.setBounds(320,130,20,20);add(l46);
			t94.setBounds(350,130,30,20);add(t94);
			b13.setBounds(400,130,30,20);add(b13);
			
			l47.setBounds(320,155,150,30);add(l47);		//Default RS
			l48.setBounds(320,190,20,20);add(l48);
			t95.setBounds(350,190,30,20);add(t95);
			b14.setBounds(400,190,30,20);add(b14);
			
			b15.addActionListener(this);
			b15.setBounds(310,220,140,20);add(b15);		//Default all the Day Choose
			b16.setBounds(310,250,140,20);
			b16.setFont(new Font("Arial",Font.BOLD,10));add(b16);
			t96.setBounds(470,250,50,20);add(t96);
			add(l50);
			
			if(e.getSource()==b13)
			{
				t94.getText();
			}
			
			
		}
	}
	public static void main(String[] args) 
	{
		new A("Ankit");
    }
}