import java.awt.*;
class ff
{
	public static void main (String args [])
	{
		Frame f = new Frame ();
		f.setSize (400,300);
		BorderLayout bl = new BorderLayout ();
		f.setLayout (bl);

		Panel p1 = new Panel ();
		Panel p2 = new Panel ();
		Panel p3 = new Panel ();

		Label l = new Label ("Ques:  Who is the Smartest person alive?");
		p1.add (l);
	
		Button b1 = new Button ("PREVIOUS");
		Button b2 = new Button ("NEXT");
		p2.add (b1);
		p2.add (b2);

		Panel p4 = new Panel (new FlowLayout (FlowLayout.LEFT));
		GridLayout gl = new GridLayout (4,0);
		p3.setLayout (gl);
		//CheckboxGroup ans= new CheckboxGroup (); 
		//for radio buttons add this line in code and also add ans as argument in the Ckeckboxes)
		Checkbox cbA = new Checkbox ("   A:     S" , true );
		Checkbox cbB = new Checkbox ("   B:     S i a" , false );
		Checkbox cbC = new Checkbox ("   C:     S" , false );
		Checkbox cbD = new Checkbox ("   D:     S" , false );
		p3.add (cbA);
		p3.add (cbB);
		p3.add (cbC);
		p3.add (cbD);
		
		p4.add (p3);
		
		f.add (p1,"North");
		f.add (p2, "South");
		f.add (p4, "Center");
		f.add (new Label ("") , "West");
		
		f.setVisible (true);
	}
}