package turizam;

import java.io.FileWriter;
import java.io.IOException;


public class Letovanje implements Put, Comparable<Put>{
	
	private String nazivdestinacije;
	private int brdana;
	private double cenapodanu;
	
	public Letovanje(String naziv_destinacije, int broj_dana, double cena_po_danu) {
		this.nazivdestinacije = naziv_destinacije;
		this.brdana = broj_dana;
		this.cenapodanu = cena_po_danu;
	}
	public double getCena() {
		return brdana*cenapodanu*(Math.random()+1);
	}
	
	public void upisiUFajl() throws IOException {
		
		FileWriter pisatelj = new FileWriter(this.getCena() + ".txt");
		pisatelj.write(nazivdestinacije.split(" ")[0]);
		pisatelj.close();
	}
	
	public int compareTo(Put o) {
		if(this.getCena() > o.getCena()) {
			return 1;
		}else if(this.getBrdana() == o.getCena()) {
			return 0;
		}else {
			return -1;
		}
	}
	
	public String getNazivdestinacije() {
		return nazivdestinacije;
	}
	
	public void setNazivdestinacije(String nazivdestinacije) {
		this.nazivdestinacije = nazivdestinacije;
	}
	
	public int getBrdana() {
		return brdana;
	}
	
	public void setBrdana(int brdana) {
		this.brdana = brdana;
	}
	
	public double getCenapodanu() {
		return cenapodanu;
	}
	
	public void setCenapodanu(double cenapodanu) {
		this.cenapodanu = cenapodanu;
	}
	
}
