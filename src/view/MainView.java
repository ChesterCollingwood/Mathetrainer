package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel mainPane;
	private JButton returnToPreload;
	
	public MainView() {	
		//erstellt alle sichtbaren Elemente
		createVisibles();
		
		//fügt dem Frame die Panel hinzu und den Paneln alle sichtbaren Elemente
		add(mainPane);
		mainPane.add(returnToPreload);
				
		//setzt die standard Schließen-Operation, Sichtbarkeit und Größe des Fensters
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
		setSize(600, 600);
	}
	
	//initialisiert die sichtbaren Elemente
	public void createVisibles() {
		mainPane = new JPanel();
		
		returnToPreload = new JButton("zurück zum Auswahlbildschirm");
	}
	
	//zeigt das Panel
	public void showMainFrame(String calcCase) {
		//zeigt den Titel auf Basis der ausgewählten Operation an
		setTitle(calcCase);
		
		//setzt die Sichtbarkeiten
		mainPane.setVisible(true);
		setVisible(true);
	}
	
	//Get-Methode für den Return-Button
	public JButton getReturnBtn() {
		return returnToPreload;
	}
}
