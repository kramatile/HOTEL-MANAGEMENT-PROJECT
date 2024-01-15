package forms;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Chambre;

public class ChambreForms  extends GeneralForms{
	private static Chambre g =new Chambre();
	private static final long serialVersionUID = 1L;

	public ChambreForms() {
		super(g);
		
		
		JPanel p= new JPanel();
		
		p.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JPanel p1=new JPanel();
		p1.add(new Buttons(new String[] {"Enregistrer","Quitter"}));
		
		add(BorderLayout.SOUTH, p1);
		add(BorderLayout.NORTH, p);
		
	}
	
	 
}
