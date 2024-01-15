package forms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;




import beans.Client;
import beans.FileManager;

public class ClientForms extends GeneralForms implements ActionListener{

	
	JLabel l1 ;
	int count =0;
	Client g ;
	public ClientForms(Client g) {
		super(g);
		JLabel l=new JLabel("Id");
		l1=new JLabel(g.getId()+"");
		JPanel p=new JPanel();		
		p.setLayout(new FlowLayout(FlowLayout.LEFT));
		l.setBorder(new EmptyBorder(20,0,0,80)); //Marge: haut, gauche, bas, droit
		l1.setBorder(new EmptyBorder(20,15,0,70));
		p.add(l); p.add(l1);
		p.setBackground(Color.LIGHT_GRAY);
		
		
		JPanel p2=new JPanel();
		Buttons buttons = new Buttons(new String[] {"Enregistrer","Quitter","Reinitialiser"});
		p2.add(buttons );
		
		add(p,BorderLayout.NORTH);
		add(p2,BorderLayout.SOUTH);
		
		setBackground(Color.RED);
		for ( Component button : buttons.getComponents()) {
				((JButton )button).addActionListener(this);
		}
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (((JButton)e.getSource()).getText() =="Enregistrer") {
			
			
			
				
				List<String> tab=new ArrayList<String>();
					for( LabeledTextField l :labelsTexts) {
						tab.add(l.getText());
					
					
					
					 
					 
				     
				
				
					}
					FileManager.Client(tab);
			
								}
		else if(((JButton)e.getSource()).getText() =="Reinitialiser") {
			for( LabeledTextField l :labelsTexts) {
				l.setText("");
							}
		}
		else if(((JButton)e.getSource()).getText() =="Quitter") {
				System.out.println(" quit ....");
							}
		}
		
	}


