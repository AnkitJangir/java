/**
 * @(#)PizzaApplet.java
 *
 *
 * @author Ankit Jnagir
 * @version 1.00 2016/10/15
 */

import java.awt.*;

public class PizzaApplet extends java.applet.Applet
{

    public void init() 
    {
    	//code for checkbox and Radio Buttton starts here
    	CheckboxGroup pizzaGroup=new CheckboxGroup();
    	Checkbox cbLarge=new Checkbox("Large pizza",pizzaGroup,true);
    	Checkbox cbMedium=new Checkbox("Medium pizza",pizzaGroup,true);
    	Checkbox cbSmall=new Checkbox("Small pizza",pizzaGroup,false); 
    	add(cbLarge);
    	add(cbMedium);
    	add(cbSmall);    
    	Checkbox a=new Checkbox("Singing",true);
    	add(a);
    	if(cbLarge.getState()==false)
    		cbLarge.setState(true);//for default selection
    	if(pizzaGroup.getSelectedCheckbox()!=cbMedium)
    		pizzaGroup.setSelectedCheckbox(cbMedium);//same as setState() using for default selection
    	
    	//Code for Checkbox and Radio Button Ends here
    	   
    	   //Code for Choice Class Starts here
    	   
    	   Choice ch=new Choice();
    	   ch.add("java");
    	   ch.add("php");
    	   ch.add("Python");
    	   ch.add("Yahoo");
    	   ch.add("FB");
    	   add(ch);
    	   String s;
    	   s=ch.getItem(2);
    	   ch.getSelectedItem();
    	   ch.select(2);
    	   ch.remove(2);
    	   //ch.removeAll();
    	   
    	   //Code For Choice Class Ends Here
    	   
    	   //Code For List Class Starts Here
    	   
    	   List l=new List(6,true);
    	   l.add("R");
    	   l.add("Ankit Jnagir");
    	   l.add("Raj Malhotra");
    	   l.add("AJ");
    	   l.add("Vibha Sharma");
    	   l.add("Rahul Kumawat");
    	   l.add("Yami");  // Sequentially
    	   l.add("akku");
    	   add(l);
    	   l.add("Ankur Jangir",2);  //Insetion
    	   
    	   String s1;
    	   s1=l.getItem(2);
    	   System.out.println(s);
    	   System.out.println();
    	   if(l.isMultipleMode()==false)
    	   	l.setMultipleSelections(true);
    	   String arr[];
    	   arr=l.getItems();
    	   for(int i=0;i<arr.length;i++)
    	   	System.out.println(arr[i]);
    	   	System.out.println();
    	   	l.select(1);
    	   	l.select(2);
    	   String s2;
    	   s2=l.getSelectedItem();
    	   System.out.println("The N"+s2);
    	   int b;
   			b=l.getSelectedIndex();
    	  System.out.println(b);
    	  l.replaceItem("Ankti JAngir",4);
    	 /* int c[];
    	 c=l.getSelectedIndexes();
    	  for(int i=0;i<arr.length;i++)
    	  	System.out.println(c[i]);*/
    	  
    	  // Coding for List Class Ends here
    	  
    	  // Canvas Class
    	  Canvas d=new Canvas ();
    	  d.setSize(100,50);
    	  d.setBackground(Color.red);
    	  add(d);
    	  
    	  //Coding for Canvas Class  Ends here
    	  
    	  //Coding for ScrollPane Class Starts here
    	  
    	 ScrollPane sc=new ScrollPane();
    	  add(sc);
    	  ScrollPane scr=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
    	  add(scr);
    	  
    	  //Coding for ScrrollPane ends Here
    	  
    	  Scrollbar sc1=new Scrollbar();
    	  add(sc1);
    	  Scrollbar sc2=new Scrollbar(Scrollbar.HORIZONTAL);
    	  add(sc2);
    	  Scrollbar sc3=new Scrollbar(Scrollbar.HORIZONTAL,25,5,0,100);
    	  add(sc3);
    	  int e;
    	  e=sc3.getValue();
    	  System.out.println(e);
    	  System.out.println();
    	  sc3.setValue(100);
    	  int f;
    	  f=sc3.getMinimum();
    	  System.out.println(f);
    	  System.out.println();
    	  int g;
    	  g=sc3.getMaximum();
    	  System.out.println(g);
    	  System.out.println();
       	  sc3.setMinimum(2);
    	  sc3.setMaximum(50);
    	  int h;
    	  h=sc3.getVisibleAmount();
    	  System.out.println(h);
    	  System.out.println();
    	  sc3.setVisibleAmount(25);
    	  int i;
    	  i=sc3.getUnitIncrement();
    	  System.out.println(i);
    	  System.out.println();
    	  sc3.setUnitIncrement(6);
    	  int j;
    	  j=sc3.getBlockIncrement();
    	  System.out.println(j);
    	  System.out.println();
    	  sc3.setBlockIncrement(20);
    	  //Coding for Scrollbar CLass Ends here
    	  
    	  
    }

}
//<applet code="PizzaApplet.class" width=400 height=300></applet>