/**
 * @(#)Fruits.java
 *
 *
 * @author 
 * @version 1.00 2016/10/15
 */

import java.awt.*;

public class Fruits extends java.applet.Applet
{
    public void init() 
    {
    	String arr[]={"Mango","Pineapple","banana","Grapes"};
    	List fruitList=new List(4,true);
    	for(int i=0;i<arr.length;i++)
    		fruitList.add(arr[i]);
    	add(fruitList);
    	        // TODO start asynchronous download of heavy resources
    }
}
//<applet code="Fruits.class" width=400 height=300></applet>