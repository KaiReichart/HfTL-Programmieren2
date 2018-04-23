package shop;

public class Artikel {
	
	String bezeichnung;
	double preis;

	public Artikel(String bezeichnung, double preis) {
		this.bezeichnung = bezeichnung;
		this.preis = preis;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public double getPreis() {
		return preis;
	}
	
	

}
