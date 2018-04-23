package main;

import array.SimpleArray;

public class Main {
	public static void main(String[] args) {
		double [] Array = SimpleArray.erstelleFeld(20);
		SimpleArray.druckeFeld(Array);
		System.out.println("Kleinstes Element: "+SimpleArray.minElement(Array));
		System.out.println("Größtes Element: "+SimpleArray.maxElement(Array));
		System.out.println("Mittelwert: "+SimpleArray.berechneDurchschnitt(Array));
		System.out.println("Kleinster Abstand: "+SimpleArray.bestimmeKleinstenAbstand(Array));
		char[] zahl = {'9', '3', '7'};
		System.out.println("Quersumme: "+SimpleArray.berechneQuersumme(zahl));
	}
}
