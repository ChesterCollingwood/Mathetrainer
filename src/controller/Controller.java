package controller;

import view.View;

public class Controller {

	private View view;
	
	public Controller(View view) {
		this.view = view;
		
		//weist den Buttons aus der View eine Methode beim Klicken zu
		view.getDivisionBtn().addActionListener(listener -> showDivision());
		view.getFractionBtn().addActionListener(listener -> showFraction());
		view.getPercentBtn().addActionListener(listener -> showPercent());
	}
	
	//Methoden zum Zeigen des jeweiligen ausgewählten Panels
	public void showDivision() {
		view.getMainPane().setVisible(false);
		view.setSize(700, 700);
		//view.getDivisionPane().setVisible(true);
	}
	
	public void showFraction() {
		view.getMainPane().setVisible(false);
		view.setSize(700, 700);
	//	view.getFractionPane().setVisible(true);
	}
	
	public void showPercent() {
		view.getMainPane().setVisible(false);
		view.setSize(700, 700);
	//	view.getPercentPane().setVisible(true);
	}
}
