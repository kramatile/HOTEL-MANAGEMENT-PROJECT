package gui;
import forms.* ;

import java.awt.CardLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import beans.*;

public class MainFrame extends JFrame{
	JPanel mainPanel ;
	
	CardLayout cardLayout =new CardLayout() ;
	public MainFrame() {
		super("myHotel v1.0.0");
		setVisible(true);
		setSize(350,500);
		
		Build();
		
		
		revalidate();
		
	}
	private void Build() {
		
		
		mainPanel = new JPanel();
		setContentPane(mainPanel);
		
		
	
		mainPanel.setLayout(cardLayout);
		
		Forms();
	}
	private void Forms() {
		
		
		JPanel clientForms = new ClientForms(new Client());
		JPanel reservationForms = new ReservationForms(new Reservation());
		JPanel ChambreForms =new ChambreForms();
		Menu m = new Menu(clientForms, reservationForms, mainPanel, cardLayout);
		setJMenuBar(m.getMainMenu());
		
		mainPanel.add(clientForms,"client");
		mainPanel.add(reservationForms,"reservation");
		mainPanel.add(ChambreForms,"chambre");
		
		
	}

}
