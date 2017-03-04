package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel divisionPane, fractionPane, percentPane;
	private JButton returnToPreload;
	
	public MainView() {	
		//erstellt alle sichtbaren Elemente
		createVisibles();
		
		//fügt dem Frame die Panel hinzu und den Paneln alle sichtbaren Elemente
		add(divisionPane);
		divisionPane.add(returnToPreload);
		
		add(percentPane);
		percentPane.add(returnToPreload);
				
		add(fractionPane);
		fractionPane.add(returnToPreload);
				
		//setzt die standard Schließen-Operation, Sichtbarkeit und Größe des Fensters
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
		setSize(600, 600);
	}
	
	//initialisiert die sichtbaren Elemente
	public void createVisibles() {
		divisionPane = new JPanel();
		fractionPane = new JPanel();
		percentPane = new JPanel();
		
		divisionPane.setVisible(false);
		fractionPane.setVisible(false);
		percentPane.setVisible(false);
		
		returnToPreload = new JButton("zurück zum Auswahlbildschirm");
	}
	
	//zeigt das Panel für die Division
	public void showDivisionFrame() {
		//definiert das Frame
		setTitle("Division üben");
		
		//setzt die Sichtbarkeiten
		divisionPane.setVisible(true);
		setVisible(true);
	}
	
	//zeigt das Panel für die Prozentrechnung
	public void showPercentFrame() {
		//definiert das Frame
		setTitle("Prozentrechnung üben");
		
		//setzt die Sichtbarkeiten
		percentPane.setVisible(true);
		setVisible(true);
	}
	
	//zeigt das Panel für die Bruchrechnung
	public void showFractionFrame() {
		//definiert das Frame
		setTitle("Bruchrechnung üben");
		
		//setzt die Sichtbarkeiten
		fractionPane.setVisible(true);
		setVisible(true);
	}
	
	//Get-Methode für den Return-Button
	public JButton getReturnBtn() {
		return returnToPreload;
	}
}
