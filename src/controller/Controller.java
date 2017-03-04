package controller;

import model.Data;
import view.MainView;
import view.Preloader;

public class Controller {

	private Preloader menu;
	private MainView main;
	private Data data;
	
	public Controller(Preloader menu) {
		//weist dem Controller den übergebenen Preloader zu
		this.menu = menu;
		
		//initialisiert eine neue Main-View und das Data-Model
		main = new MainView();
		data = new Data();
		
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
