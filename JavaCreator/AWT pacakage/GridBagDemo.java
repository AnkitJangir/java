import java.awt.*;
class GridBagDemo
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(400,300);
		f.setVisible(true);
		f.setLayout(new GridBagLayout());
		Button b1=new Button("Ok");
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=2;
		gbc.gridheight=2;
		gbc.ipadx=6;
		gbc.ipady=4;
		Insets i=new Insets(2,5,3,7);
		gbc.insets=i;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.NORTH;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		f.add(b1,gbc);
		Button b2=new Button("Cancel");
		f.add(b2,gbc);
		
	}
}