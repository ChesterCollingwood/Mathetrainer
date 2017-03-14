package model;
import java.util.Random;

public class Data {
	
	Random rN = new Random();
	private int tA;
	private int bA;
	private int tB;
	private int bB;
	private int fRt;
	private int fRb;
	private int dDS;
	private int dDD;
	private int dQ;
	private int dR;
	private int dRQ;
	private int dRR;
	private int pF;
	private int pT;
	private double pP;
	private double pPP;
	
	public Data() {
		
	}
	
	/* erstellt eine zufÃ¤llige Divisionsaufgabe mit Rest mit Dividend zwischen 1 und 100 und Divisor zwischen 1 und
	 * der HÃ¤lfte des Dividenden, um hÃ¤ufige Ergebnisse wie "1 mit Rest x" zu vermeiden
     * Der Benutzer muss dann den gesuchten Quotienten mit Rest angeben.*/
	public void DivisionIni() {
		setdDD(rN.nextInt(100) + 1);
		setdDS(rN.nextInt((getdDD() / 2)) + 1);
		setdQ((getdDD() / getdDS()));
		setdR((getdDD() % getdDS()));
		
	}
	
	/* erstellt zufÃ¤lligen Bruch mit Nenner zwischen 1 und 25 und einem entsprechenden ZÃ¤hler,
	 * der kleiner als der Nenner ist.*/
	public void FractionIni() {
		setbA(rN.nextInt(25) + 1);
		settA(rN.nextInt(getbA()) + 1);
		
	}
	
	/* Zum berechnen des grÃ¶ÃŸten gemeinsamen Teilers des Bruches, notwendig um den Bruch
	 * anschlieÃŸend kÃ¼rzen zu kÃ¶nnen*/
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
	
	
	/* KÃ¼rzt den zuvor erstellten Bruch durch berechnen des ggT und anschlieÃŸendes
	 * Teilen von sowohl ZÃ¤hler als auch Nenner durch den ggT*/
	public void FractionSimplify() {
		int fGGT = ggT(gettA(), getbA());
		settB((gettA() / fGGT));
		setbB((getbA() / fGGT));		
		
	}
	
	/* Erzeugt eine Zahl "pT" zwischen 1 und 100 und eine Zahl "pF" zwischen 1 und "pT". 
	 * Die Aufgabe wird in der Form "pF sind (blank) Prozent von pT" gestellt, der Benutzer muss dann
	 * die gesuchte Prozentzahl (pP) eintragen.*/
	public void PercentageIni() {
		setpT(rN.nextInt(100) + 1);
		setpF(rN.nextInt(getpT() + 1));
		setpP((getpF() * 100) / getpT());		
		setpPP((((double)(getpF()) * 100) / (double)(getpT()))); 
		setpPP(getpPP() * 100);
		setpPP(Math.round(getpPP()));
		setpPP(getpPP() / 100);
		
		//setpPP(getpPP() + (((getpF() * 10) % getpT())));
	}

	//Get- und Set-Methoden für die Variablen
	public int getdDD() {
		return dDD;
	}

	
	public void setdDD(int dDD) {
		this.dDD = dDD;
	}

	
	public int getdDS() {
		return dDS;
	}

	
	public void setdDS(int dDS) {
		this.dDS = dDS;
	}

	
	public int getdQ() {
		return dQ;
	}

	
	public void setdQ(int dQ) {
		this.dQ = dQ;
	}

	
	public int getdR() {
		return dR;
	}

	
	public void setdR(int dR) {
		this.dR = dR;
	}

	
	public int gettA() {
		return tA;
	}

	
	public void settA(int tA) {
		this.tA = tA;
	}

	
	public int getbA() {
		return bA;
	}

	
	public void setbA(int bA) {
		this.bA = bA;
	}

	
	public int getfRt() {
		return fRt;
	}

	
	public void setfRt(int fRt) {
		this.fRt = fRt;
	}

	
	public int getfRb() {
		return fRb;
	}

	
	public void setfRb(int fRb) {
		this.fRb = fRb;
	}

	
	public int gettB() {
		return tB;
	}

	
	public void settB(int tB) {
		this.tB = tB;
	}

	
	public int getbB() {
		return bB;
	}

	
	public void setbB(int bB) {
		this.bB = bB;
	}

	
	public int getdRQ() {
		return dRQ;
	}

	
	public void setdRQ(int dRQ) {
		this.dRQ = dRQ;
	}

	
	public int getdRR() {
		return dRR;
	}

	
	public void setdRR(int dRR) {
		this.dRR = dRR;
	}

	
	public int getpF() {
		return pF;
	}

	
	public void setpF(int pF) {
		this.pF = pF;
	}

	
	public double getpP() {
		return pP;
	}

	
	public void setpP(double pP) {
		this.pP = pP;
	}

	
	public int getpT() {
		return pT;
	}

	
	public void setpT(int pT) {
		this.pT = pT;
	}

	
	public double getpPP() {
		return pPP;
	}

	
	public void setpPP(double pPP) {
		this.pPP = pPP;
	}
	
	
}
