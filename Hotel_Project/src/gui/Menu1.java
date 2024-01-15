package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Menu1 extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    JMenuBar mainBar;
    JButton AClient, MClient;
    JButton Chambres, AChambres, IDChambre;
    JButton Reservation, CReservation, MReservation;
    JButton AttChambre, VerOccup, ChambreOccupe;
    JPanel clientForms;
    JPanel reservationForms;
    CardLayout cardLayout;
    JPanel mainPanel ;
    public Menu1(JPanel clientForms ,JPanel reservationForms,JPanel mainPanel ,CardLayout cardLayout) {
    	this.clientForms =clientForms;
    	this.reservationForms=reservationForms;
    	this.mainPanel = mainPanel ;
    	this.cardLayout = cardLayout;
        // MAIN MENU
        mainBar = new JMenuBar();

        // CLIENT MENU
        AClient = new JButton("Ajouter Client");
        MClient = new JButton("Modifier Client");

        // Action listener
        AClient.addActionListener(this);
        MClient.addActionListener(this);

        // Add buttons to the main menu bar
        mainBar.add(AClient);
        mainBar.add(MClient);

        // ... Repeat the above steps for other buttons (Chambres, Reservation, Occupation) ...

        // Add menu to the panel
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
        } else if (e.getSource() == MClient) {
            // Handle Modifier Client button click
        	cardLayout.show(mainPanel,"reservation");
        }
        // ... Repeat the above if conditions for other buttons ...
    }
}
