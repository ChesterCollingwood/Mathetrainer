package controller;

import model.Data;
import view.MainView;
import view.Preloader;

public class Controller {

	private Preloader menu;
	private MainView main;
	private Data data;
	private String calcCase = null;
	
	public Controller(Preloader menu) {
		//weist dem Controller den Übergebenen Preloader zu
		this.menu = menu;
		
		//initialisiert eine neue Main-View und das Data-Model
		main = new MainView();
		data = new Data();
		
		//weist den Buttons einen ActionListener zu, setzt die gewünschte Rechenoperation
		//DIVISION
		menu.getDivisionBtn().addActionListener(e -> {
			calcCase = "Division Üben";
			showCalcFrame();
		
		//Erstellt bei pressen des Buttons eine neue Divisionsaufgabe
			main.getGenerateBtn().addActionListener(f -> {
				data.DivisionIni();
				main.deleteAll();
				main.setFirstNumber(data.getdDD());
				main.setSecondNumber(data.getdDS());
		
			}); 
		
		//Prüft die Eingabe auf Richtigkeit und gibt einen entsprechenden Dialog zurück	
			main.getCalculateBtn().addActionListener(g -> {
				data.setdRQ(Integer.parseInt(main.getResult().getText()));
				data.setdRR(Integer.parseInt(main.getRest().getText()));
				if (data.getdQ() == data.getdRQ() && data.getdR() == data.getdRR()) {
					main.showRight();
				}
				else {
					main.showWrongDivision();
				}
			});
		});
		
		//BRUCHRECHNUNG
		menu.getFractionBtn().addActionListener(e -> {
			calcCase = "Bruchrechnung Üben";
			showCalcFrame();
		
		//Erstellt bei pressen des Buttons einen neuen Bruch
			main.getGenerateBtn().addActionListener(f -> {
				data.FractionIni();
				main.deleteAll();
				main.setFractionUpperFirst(data.gettA());
				main.setFractionLowerFirst(data.getbA());
				data.FractionSimplify();
				
			});
		
		//Prüft die Eingabe auf Richtigkeit und gibt einen entsprechenden Dialog zurück	
			main.getCalculateBtn().addActionListener(g -> {
				data.setfRt(Integer.parseInt(main.getFractionUpperResult().getText()));
				data.setfRb(Integer.parseInt(main.getFractionLowerResult().getText()));
			
				if (data.getfRt() == data.gettB() && data.getfRb() == data.getbB()) {
					main.showRight();
				}
				else {
					main.showWrongFraction();
				}
				
			});
			
		});
		
		//PROZETNRECHNUNG
		menu.getPercentBtn().addActionListener(e -> {
			calcCase = "Prozentrechnung Üben";
			showCalcFrame();
			
		//Erstellt bei pressen des Buttons eine neue Prozentrechenraufgabe	
			main.getGenerateBtn().addActionListener(f -> {
				data.PercentageIni();
				main.deleteAll();
				main.setFirstNumber(data.getpF());
				main.setSecondNumber(data.getpT());
			
		//Prüft die Eingabe auf Richtigkeit und gibt einen entsprechenden Dialog zurück		
			});
			main.getCalculateBtn().addActionListener(g -> {
				data.setpP(Double.parseDouble(main.getPercentResult().getText()));
				
				if (data.getpP() == data.getpPP()) {
					main.showRight();
				}
				else {
					main.showWrongPercent();
				}
			});
				
		});
		
		main.getReturnBtn().addActionListener(listener -> returnToPreload());
		main.getCancelBtn().addActionListener(listener -> main.deleteAll());
	}
	
	//Methoden zum Zeigen des Panels
	public void showCalcFrame() {	
		main.showMainFrame(calcCase);
		menu.setVisible(false);
	}
	
	//Methode zum Zurückkehren zur Preload-View
	public void returnToPreload() {
		menu.setVisible(true);
		main.setVisible(false);
		main.removeChildPanes();
	}
}
