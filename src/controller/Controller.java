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
		//weist dem Controller den übergebenen Preloader zu
		this.menu = menu;
		
		//initialisiert eine neue Main-View und das Data-Model
		main = new MainView();
		data = new Data();
		
		//weist den Buttons einen ActionListener zu, setzt die gewünschte Rechenoperation
		menu.getDivisionBtn().addActionListener(e -> {
			calcCase = "Division üben";
			showCalcFrame();
		});
		menu.getFractionBtn().addActionListener(e -> {
			calcCase = "Bruchrechnung üben";
			showCalcFrame();
		});
		menu.getPercentBtn().addActionListener(e -> {
			calcCase = "Prozentrechnung üben";
			showCalcFrame();
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
