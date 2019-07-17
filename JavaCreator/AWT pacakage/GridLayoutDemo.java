/**
 * @(#)GridLayoutDemo.java
 *
 *
 * @author Ankit Jangir
 * @version 1.00 2016/10/18
 */

import java.awt.*;
//<applet code="GridLayoutDemo" width=300 height=200></applet>
public class GridLayoutDemo extends java.applet.Applet {
   static final int n=4;
    public void init() {
        setLayout(new GridLayout(n,n));
        setFont(new Font("SansSerif",Font.BOLD,24));
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		int k=i*n+j;
        		if(k>0)
        			add(new Button(""+k));
        	}
        }
    }

    public void paint(Graphics g) {
        
    }
}