package shop;

public class Warenkorb {
	
	private int anzahl = 0;
	private Artikel artFeld[] = new Artikel[100];
	
	public void add(Artikel a) {
		if(a == null || anzahl >= 100) {
			return;
		}
		artFeld[anzahl] = a;
		anzahl++;
	}
	
	public double getSumme() {
		if(artFeld == null) {
			return 0;
		}
		double summe = 0;
		for(Artikel i:artFeld) {
			if(i == null) {
				continue;
			}
			summe += i.getPreis();
		}
		return summe;
	}
	
	public int getAnzahl() {
		return anzahl;
	}
	
	public void remove(Artikel a) {
		if(artFeld == null || a == null || anzahl == 0) {
			return;
		}
		for(int i = 0; i < anzahl; i++) {
			if(artFeld[i] != null && a.getBezeichnung() == artFeld[i].getBezeichnung() && a.getPreis() == artFeld[i].getPreis()) {
				artFeld[i] = artFeld[anzahl-1];
				artFeld[anzahl-1] = null;
				anzahl -= 1;
				remove(a);
			}
			
		}
	}

}
