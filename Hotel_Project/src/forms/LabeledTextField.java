package forms;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LabeledTextField extends JPanel{
	
	

	public LabeledTextField(String s, int col, int labelwidth) {
		JLabel l=new JLabel(s);
		JTextField tf=new JTextField(col);
		add(l); add(tf);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		((JLabel)this.getComponent(0)).setPreferredSize(new Dimension(labelwidth,60));
	}
	
	public String getText() {
		return ((JTextField)this.getComponent(1)).getText();
	}
	
	public void setText(String s) {
		((JTextField)this.getComponent(1)).setText(s);
	}
	
}
