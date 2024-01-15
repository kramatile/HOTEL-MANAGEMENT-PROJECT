package forms;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Reservation;

public class ReservationForms extends GeneralForms{

	/**
	 * 
	 */
	private static Reservation g =new Reservation();
	private static final long serialVersionUID = 1L;

	public ReservationForms(Reservation g) {
		super(g);
		JPanel p= new JPanel();
		JLabel l=new JLabel("Date");
		l.setBorder(new EmptyBorder(0,0,0,60));
		p.add(l); 
		p.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		String[] jours= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
		JComboBox<String> c=new JComboBox<>(jours);
		String[] mois= {"1","2","3","4","5","6","7","8","9","10","11","12"};
		JComboBox<String> c1=new JComboBox<>(mois);
		String[] annnes= {"2023","2024","2025","2026","2027","2028","2029","2030"};
		JComboBox<String> c2=new JComboBox<>(annnes);

		
		JPanel p2= new JPanel();
		p2.add(c); p2.add(c1); p2.add(c2); 
		p.add(p2);
		
		JPanel p1=new JPanel();
		p1.add(new Buttons(new String[] {"Réservation","Occupation","Réinitialisation","Quitter"}));
		
		add(BorderLayout.SOUTH, p1);
		add(BorderLayout.NORTH, p);
		
	}


	
	 
}
