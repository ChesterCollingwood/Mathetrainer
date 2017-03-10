package model;
import java.util.Random;

public class Data {
	
	Random rN = new Random();
	int tA, bA, tB, bB;
	int dDS, dDD, dQ, dR;
	int pF, pT, pP;
	
	public Data() {
		
	}
	
	/* erstellt eine zufällige Divisionsaufgabe mit Rest mit Dividend zwischen 1 und 100 und Divisor zwischen 1 und
	 * der Hälfte des Dividenden, um häufige Ergebnisse wie "1 mit Rest x" zu vermeiden
     * Der Benutzer muss dann den gesuchten Quotienten mit Rest angeben.*/
	public void DivisionIni() {
		dDD = rN.nextInt(100) + 1;
		dDS = rN.nextInt((dDD / 2)) + 1;
		dQ = (dDD / dDS);
		dR = (dDD % dDS);
		
	}
	
	/* erstellt zufälligen Bruch mit Nenner zwischen 1 und 25 und einem entsprechenden Zähler,
	 * der kleiner als der Nenner ist.*/
	public void FractionIni() {
		bA = rN.nextInt(25) + 1;
		tA = rN.nextInt(bA) + 1;
		
	}
	
	/* Zum berechnen des größten gemeinsamen Teilers des Bruches, notwendig um den Bruch
	 * anschließend kürzen zu können*/
	private static int ggT(int fZ1, int fZ2) {
		while (fZ2 != 0) {
			if (fZ1 > fZ2) {
				fZ1 = fZ1 - fZ2;
			}
			else {
				fZ2 = fZ2 - fZ1;
				
			}
		}
			return fZ1;
		
	}
	
	
	/* Kürzt den zuvor erstellten Bruch durch berechnen des ggT und anschließendes
	 * Teilen von sowohl Zähler als auch Nenner durch den ggT*/
	public void FractionSimplify() {
		int fGGT = ggT(tA, bA);
		tB = (tA / fGGT);
		bB = (bA / fGGT);		
		
	}
	
	/* Erzeugt eine Zahl "pT" zwischen 1 und 100 und eine Zahl "pF" zwischen 1 und "pT". 
	 * Die Aufgabe wird in der Form "pF sind (blank) Prozent von pT" gestellt, der Benutzer muss dann
	 * die gesuchte Prozentzahl (pP) eintragen.*/
	public void PercentageIni() {
		pT = rN.nextInt(100) + 1;
		pF = rN.nextInt(pT + 1);
		pP = (pF * 100) / pT;		
		
		
	}
	
	
}
