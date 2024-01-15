package beans;

import forms.attributsGetter;

public class Client implements attributsGetter{
	
	private static int id=0;
	private String nom;
	private String ville;
	private String pays;
	
	public Client(){
		
	}

	public Client(String n, String v, String p) {
		id++;
		nom=n;
		ville=v;
		pays=p;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public static int getId() {
		return id;
	}
	
	public String toString() {
		return "Client [nom=" + nom + ", ville=" + ville + ", pays=" + pays + "]";
	}

	public int getNum() {
		return 3;
	}

	public String getLabel(int index) {
		switch(index) {
		case(0): return "Nom du client";
		case(1): return "Ville";
		case(2): return "Pays";
		}
		return null;
	}

	public int getCol(int index) {
		switch(index) {
		case(0): return 15;
		case(1): return 10;
		case(2): return 15;
		}
		return 0;
	}
	
}
