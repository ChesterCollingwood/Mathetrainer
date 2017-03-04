package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel divisionPane, fractionPane, percentPane;
	
	public MainView() {	
		createVisibles();
		
		//setzt die standard Schließen-Operation, Sichtbarkeit und Größe des Fensters
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
		setSize(600, 600);
	}
	
	public void createVisibles() {
		divisionPane = new JPanel();
		fractionPane = new JPanel();
		percentPane = new JPanel();
	}
	
	public void showDivisionFrame() {
		add(divisionPane);
		setTitle("Division üben");
		setVisible(true);
	}
	
	public void showPercentFrame() {
		add(percentPane);
		setTitle("Prozentrechnung üben");
		setVisible(true);
	}
	
	public void showFractionFrame() {
		add(fractionPane);
		setTitle("Bruchrechnung üben");
		setVisible(true);
	}
}
