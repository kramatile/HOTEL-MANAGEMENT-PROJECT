package forms;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttons extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Buttons(String[] s) {
		for(int i=0; i<s.length; i++) {
			add(new JButton(s[i]));
		}
		setLayout(new FlowLayout(FlowLayout.RIGHT));
	}
}
