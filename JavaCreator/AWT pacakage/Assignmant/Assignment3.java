import java.awt.*;
class Assignment3
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(400,300);
		f.setVisible(true);
		f.setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.weightx=1;
		gbc.weighty=1;
		Label l1=new Label("Name");
		f.add(l1,gbc);
		TextField t1=new TextField(10);
		gbc.gridx=3;
		f.add(t1,gbc);
		Label l2=new Label("Password");
		gbc.gridx=0;
		gbc.gridy=3;
		f.add(l2,gbc);
		TextField t2=new TextField(10);
		gbc.gridx=3;
		gbc.gridy=3;
		f.add(t2,gbc);
		Button b=new Button("OK");
		gbc.gridx=2;
		gbc.gridy=4;
		f.add(b,gbc);
	}
}