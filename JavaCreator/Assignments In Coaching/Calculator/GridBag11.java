import java.awt.*;
class GridBag11
{
	public static void main(String args[])
	{
	     Frame f = new Frame();
	     //Panel l = new Panel(new GridLayout(2,2));
	     f.setSize(400,400);
	     f.setVisible(true);
	     f.setLayout(new GridBagLayout());
	     Label b1 = new Label("Name");
         GridBagConstraints gbc = new GridBagConstraints();
         gbc.gridx=0;            gbc.gridy=0;
         gbc.gridwidth=2;        gbc.gridheight=2;
         gbc.ipadx=6;            gbc.ipady=4;
      //   Insets i = new Insets(5,5,5,5);
         //gbc.insets=i;
         gbc.fill=GridBagConstraints.HORIZONTAL;
         gbc.anchor= GridBagConstraints.NORTH;
         //gbc.weightx=1.0;   gbc.weighty=1.0;
         f.add(b1,gbc);
         //f.add(l);
         TextField b2 = new TextField();
         
         gbc.gridx=3;            gbc.gridy=0;
         f.add(b2,gbc);
         Label b3 = new Label("Password");
         
         gbc.gridx=0;            gbc.gridy=3;
         f.add(b3,gbc);
         
         TextField b4 = new TextField();
         
         gbc.gridx=3;            gbc.gridy=3;
         f.add(b4,gbc);
                 
        Button b5 = new Button("Ok");
         gbc.gridx=2;            gbc.gridy=4;
         f.add(b5,gbc);



        /* Button b6 = new Button("sssssssssssssoy");
         gbc.gridx=1;            gbc.gridy=3;
         f.add(b6,gbc);
         Button b7 = new Button("ssssssssssssssso9");
         gbc.gridx=2;            gbc.gridy=3;
         f.add(b7,gbc);
         */
         
         
         //f.add(l);
         
	    
	}
}