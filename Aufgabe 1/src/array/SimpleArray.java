package array;

import java.util.Arrays;

public class SimpleArray {

	public SimpleArray() {
	}
	
	public static double[] erstelleFeld (int laenge) {
		double[] array = new double[laenge];
		for(int i = 0; i < laenge; i++) {
			array[i] = (Math.random()*100);
			if(array[i] == 100.0) {
				array[i] -= 0.1;
			}
		}
		return array;
	}
	public static double minElement(double feld[]) {
		if(feld == null) {
			return -1;
		}
		double kleinstes = feld[0];
		
		for(int i = 0; i < feld.length; i++) {
			if(feld[i] < kleinstes) {
				kleinstes = feld[i];
			}
		}
		return kleinstes;
	}
	public static double maxElement(double feld[]) {
		if(feld == null) {
			return -1;
		}
		double groesstes = feld[0];
		for(int i = 0; i < feld.length; i++) {
			if(feld[i] > groesstes) {
				groesstes = feld[i];
			}
		}
		return groesstes;
	}
	public static void druckeFeld(double feld[]) {
		if(feld == null) {
			return;
		}
		for(int i = 0; i < feld.length; i++) {
			System.out.println(feld[i]);
		}
	}
	public static double berechneDurchschnitt(double feld[]) {
		if(feld == null) {
			return -1;
		}
		double summe = 0;
		for(int i = 0; i<feld.length; i++) {
			summe += feld[i];
		}
		summe /= feld.length;
		return summe;
	}
	public static double bestimmeKleinstenAbstand(double feld[]) {
		if(feld.length <= 1) {
			return -1;
		}
		double kleinsterAbstand = 100;
		for(int i = 0; i < feld.length; i++) {
			if (i == feld.length - 1) {
				break;
			}
			double abstand = feld[i]-feld[++i];
			if(abstand < 0) {
				abstand = 0-abstand;
			}
			if(abstand < kleinsterAbstand) {
				kleinsterAbstand = abstand;
			}
		}
		return kleinsterAbstand;
	}
	
	
	public static int berechneQuersumme(char zahl[]) {
		if(zahl == null) {
			return -1;
		}
		int quersumme = 0;
		for(int i=0; i<zahl.length; i++) {
			quersumme += Character.getNumericValue(zahl[i]);
		}
		return quersumme;
	}
	
	public static void sortArray(double feld[]) {
		Arrays.sort(feld);
	}

	
	
}
