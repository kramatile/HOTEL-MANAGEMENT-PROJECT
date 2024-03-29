package beans;

import forms.attributsGetter;

public class Reservation implements attributsGetter{
	private Client client;
	private Chambre chambre;
	private int nbreJours;
	private Date date =new Date();
	
	public Reservation() {
		
	}
	
	
	public Reservation(Client client, Chambre chambre, Date date, int nbreJours) {
		this.client = client;
		this.chambre = chambre;
		this.date = date;
		this.nbreJours = nbreJours;
	}

	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Chambre getChambre() {
		return chambre;
	}
	
	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getNbreJours() {
		return nbreJours;
	}
	
	public void setNbreJours(int nbreJours) {
		this.nbreJours = nbreJours;
	}

	public String toString() {
		return "Reservation [client=" + client + ", chambre=" + chambre + ", date=" + date + ", nbreJours=" + nbreJours
				+ "]";
	}


	public int getNum() {
		return 3;
	}


	public String getLabel(int index) {
		switch(index) {
		case(0): return "Client";
		case(1): return "Chambre";
		case(2): return "Nbre de jours";
		}
		return null;
	}


	public int getCol(int index) {
		switch(index) {
		case(0): return 10;
		case(1): return 10;
		case(2): return 10;
		}
		return 0;
	}
	
	
}
