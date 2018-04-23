package shop;

public class Kunde {
	
	private String name;
	private Warenkorb wkorb;
	

	public Kunde(String name) {
		this.name = name;
		wkorb = new Warenkorb();
	}
	
	public Warenkorb getWkorb() {
		return wkorb;
	}
	
	public String getName() {
		return name;
	}
	
	public void kauft(Artikel a) {
		wkorb.add(a);
	}
	
	public double bezahlt() {
		if(wkorb == null) {
			return 0;
		}

		double artikelPreis;
		artikelPreis = wkorb.getSumme();
		
		if(artikelPreis == 0) {
			return 0;
		}
		else if(artikelPreis < 10) {
			artikelPreis += 6;
		}
		else if(artikelPreis < 30) {
			artikelPreis += 4;
		}
		else if(artikelPreis < 100) {
			artikelPreis += artikelPreis*0.03;
		}
		
		//runden auf 2 Nachkommastellen genau
		
		artikelPreis *= 100;
		artikelPreis = Math.round(artikelPreis);
		artikelPreis /= 100;
		
		return artikelPreis;
	}
}

