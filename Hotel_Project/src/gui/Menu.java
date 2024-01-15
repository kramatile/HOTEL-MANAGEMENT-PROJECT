package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Menu extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar mainBar;
	JMenuItem AClient , MClient;
	JMenuItem Chambres , AChambres, IDChambre;
	JMenuItem Reservation , CReservation ,MReservation ;
	JMenuItem AttChambre,VerOccup ,ChambreOccupe;
	 JPanel clientForms;
	    JPanel reservationForms;
	    CardLayout cardLayout;
	    JPanel mainPanel ;
	public Menu(JPanel clientForms ,JPanel reservationForms,JPanel mainPanel ,CardLayout cardLayout) {
		// MAIN MENU
		mainBar = new JMenuBar();
		
		
		this.clientForms =clientForms;
    	this.reservationForms=reservationForms;
    	this.mainPanel = mainPanel ;
    	this.cardLayout = cardLayout;
		
		// CLIENT MENU
			// service client
		AClient = new JMenuItem("Ajouter Client");
		MClient = new JMenuItem("Modifier Client");
			// action listener
		AClient.addActionListener(this);
		MClient.addActionListener(this);
			//ajout des elements
		JMenu clientMenu = new JMenu("Clients");
		clientMenu.add(AClient);
		clientMenu.addSeparator();
		clientMenu.add(MClient);
		
		
		
		// CHAMBRE MENU
		JMenu chambreMenu = new JMenu("Chambres");
			// Services :  ,CChambres, IDChambre;
		Chambres = new JMenuItem("Ajouter Chambre");
		Chambres.addActionListener(this);
		AChambres = new JMenuItem("Afficher infos chambre");
		AChambres.addActionListener(this);
		IDChambre = new JMenuItem("ID client dans la chambre");
		IDChambre.addActionListener(this);
			// ajout des éléments
		chambreMenu.add(Chambres);
		chambreMenu.addSeparator();
		chambreMenu.add(AChambres);
		chambreMenu.addSeparator();
		chambreMenu.add(IDChambre);
		
		
		
		// RESERVATION MENU
		JMenu reservationMenu = new JMenu("Reservations");
			//services :Reservation , CReservation ,MReservation
		Reservation = new JMenuItem("Reserver chambre");
		Reservation.addActionListener(this);
		CReservation = new JMenuItem("Chercher Reservation");
		CReservation.addActionListener(this);
		MReservation = new JMenuItem("Modifier infos reservation");
		MReservation.addActionListener(this);
			// ajout des éléments
		reservationMenu.add(Reservation);
		reservationMenu.addSeparator();
		reservationMenu.add(CReservation);
		reservationMenu.addSeparator();
		reservationMenu.add(MReservation);
		
		// OCCUPATION MENU
		JMenu occupationMenu = new JMenu("Occupations");
			// services :AttChambre,VerOccup ,ChambreOccupe;
		AttChambre = new JMenuItem("Attribuer chambre"); 
		AttChambre.addActionListener(this);
		VerOccup = new JMenuItem("Verifier occupation");
		VerOccup.addActionListener(this);
		ChambreOccupe = new JMenuItem("Chambres occupées");
		ChambreOccupe.addActionListener(this);
		occupationMenu.add(AttChambre);
		occupationMenu.addSeparator();
		occupationMenu.add(VerOccup);
		occupationMenu.addSeparator();
		occupationMenu.add(ChambreOccupe );
		
		// add menu to menubar
		mainBar.add(clientMenu);
		mainBar.add(chambreMenu);
		mainBar.add(reservationMenu);
		mainBar.add(occupationMenu);
        this.add(mainBar);
	}
	
	public JMenuBar getMainMenu() {
		
		return mainBar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        // Handle button click events here
        if (e.getSource() == AClient) {
            cardLayout.show(mainPanel,"client");
        } else if (e.getSource() == Reservation) {
            // Handle Modifier Client button click
        	cardLayout.show(mainPanel,"reservation");
        }
        else if (e.getSource() == Chambres) {
            // Handle Modifier Client button click
        	cardLayout.show(mainPanel,"chambre");
        }
        // ... Repeat the above if conditions for other buttons ...
    }

}