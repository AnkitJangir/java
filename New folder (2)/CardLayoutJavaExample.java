

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CardLayoutExample extends Frame implements ActionListener {
	CardLayout card = new CardLayout(200, 200);
	Panel firstPanel;
	Panel secondPanel;
	Panel thirdPanel;

	CardLayoutExample() {

		firstPanel = firstPanel(firstPanel);
		secondPanel = secondPanel(secondPanel);
		thirdPanel = thirdPanel(thirdPanel);

		setLayout(card);
		add(firstPanel, "Card1");
		add(secondPanel, "Card2");
		add(thirdPanel, "Card3");

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Next") {
			card.next(this);

			// card.previous(this);
		} else if (e.getActionCommand() == "Prev") {
			card.previous(this);

		}
	}

	public Panel firstPanel(Panel firstPanel) {
		firstPanel = new Panel();
		// firstPanel.setSize(400, 300);
		BorderLayout bl = new BorderLayout();
		firstPanel.setLayout(bl);

		Panel p1 = new Panel();
		Panel p3 = new Panel();

		Label l = new Label("Question1: What is the Capital of Rajasthan?");
		p1.add(l);

		Panel p2 = new Panel();
		Button b1 = new Button("Prev");
		Button b2 = new Button("Next");
		p2.add(b1);
		p2.add(b2);
		firstPanel.add(p2, "South");
		b2.addActionListener(this);
		b1.addActionListener(this);
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));
		GridLayout gl = new GridLayout(4, 0);
		p3.setLayout(gl);
		Checkbox cbA = new Checkbox("   A:     Jaipur", true);
		Checkbox cbB = new Checkbox("   B:     Ajmer", false);
		Checkbox cbC = new Checkbox("   C:     Kota", false);
		Checkbox cbD = new Checkbox("   D:     Delhi", false);
		p3.add(cbA);
		p3.add(cbB);
		p3.add(cbC);
		p3.add(cbD);

		p4.add(p3);

		firstPanel.add(p1, "North");
		firstPanel.add(p4, "Center");
		firstPanel.add(new Label(""), "West");
		return firstPanel;
	}

	public Panel secondPanel(Panel secondPanel) {
		secondPanel = new Panel();
		// firstPanel.setSize(400, 300);
		BorderLayout bl = new BorderLayout();
		secondPanel.setLayout(bl);

		Panel p1 = new Panel();
		Panel p3 = new Panel();

		Label l = new Label("Question2: What is the Capital of Gujarat?");
		p1.add(l);
		Panel p2 = new Panel();
		Button b1 = new Button("Prev");
		Button b2 = new Button("Next");
		p2.add(b1);
		p2.add(b2);
		secondPanel.add(p2, "South");
		b2.addActionListener(this);
		b1.addActionListener(this);
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));
		GridLayout gl = new GridLayout(4, 0);
		p3.setLayout(gl);
		Checkbox cbA = new Checkbox("   A:     Gandhinagar", true);
		Checkbox cbB = new Checkbox("   B:     Ajmer", false);
		Checkbox cbC = new Checkbox("   C:     Kota", false);
		Checkbox cbD = new Checkbox("   D:     Delhi", false);
		p3.add(cbA);
		p3.add(cbB);
		p3.add(cbC);
		p3.add(cbD);

		p4.add(p3);

		secondPanel.add(p1, "North");
		secondPanel.add(p4, "Center");
		secondPanel.add(new Label(""), "West");

		return secondPanel;
	}

	public Panel thirdPanel(Panel thirdPanel) {
		thirdPanel = new Panel();
		// firstPanel.setSize(400, 300);
		BorderLayout bl = new BorderLayout();
		thirdPanel.setLayout(bl);

		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();

		Label l = new Label("Question3: What is the Capital of  Uttar Pradesh?");
		p1.add(l);

		Button b1 = new Button("Prev");
		Button b2 = new Button("Next");
		p2.add(b1);
		p2.add(b2);
		b2.addActionListener(this);
		b1.addActionListener(this);
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));
		GridLayout gl = new GridLayout(4, 0);
		p3.setLayout(gl);
		Checkbox cbA = new Checkbox("   A:     Allahabad", true);
		Checkbox cbB = new Checkbox("   B:     Lucknow", false);
		Checkbox cbC = new Checkbox("   C:     Kota", false);
		Checkbox cbD = new Checkbox("   D:     Delhi", false);
		p3.add(cbA);
		p3.add(cbB);
		p3.add(cbC);
		p3.add(cbD);
		p4.add(p3);
		thirdPanel.add(p1, "North");
		thirdPanel.add(p2, "South");
		thirdPanel.add(p4, "Center");
		thirdPanel.add(new Label(""), "West");

		return thirdPanel;
	}

	public static void main(String args[]) {
		CardLayoutExample frame = new CardLayoutExample();
		frame.setTitle("CardLayout in Java Example");
		frame.setSize(700, 600);
		frame.setResizable(true);
		frame.setVisible(true);
	}
}