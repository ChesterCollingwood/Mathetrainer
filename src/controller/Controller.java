package controller;

import view.MainView;
import view.Preloader;

public class Controller {

	private Preloader menu;
	private MainView main;
	
	public Controller(Preloader menu) {
		this.menu = menu;
		
		main = new MainView();
		
		//weist den Buttons aus der View eine Methode beim Klicken zu
		menu.getDivisionBtn().addActionListener(listener -> showDivision());
		menu.getFractionBtn().addActionListener(listener -> showFraction());
		menu.getPercentBtn().addActionListener(listener -> showPercent());
	}
	
	//Methoden zum Zeigen des jeweiligen ausgewählten Panels
	public void showDivision() {
		main.showDivisionFrame();
		menu.setVisible(false);
	}
	
	public void showFraction() {
		main.showFractionFrame();
		menu.setVisible(false);
	}
	
	public void showPercent() {
		main.showPercentFrame();
		menu.setVisible(false);
	}
}
