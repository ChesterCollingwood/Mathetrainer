package controller;

import view.MainView;
import view.Preloader;

public class Controller {

	private Preloader menu;
	
	public Controller(Preloader menu) {
		this.menu = menu;
		
		//weist den Buttons aus der View eine Methode beim Klicken zu
		menu.getDivisionBtn().addActionListener(listener -> showDivision());
		menu.getFractionBtn().addActionListener(listener -> showFraction());
		menu.getPercentBtn().addActionListener(listener -> showPercent());
	}
	
	//Methoden zum Zeigen des jeweiligen ausgewählten Panels
	public void showDivision() {

	}
	
	public void showFraction() {

	}
	
	public void showPercent() {

	}
}
